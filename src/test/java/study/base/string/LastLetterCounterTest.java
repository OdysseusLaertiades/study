package study.base.string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class LastLetterCounterTest extends TestData {

  private final LastLetterCounter lastLetterCounter = new LastLetterCounter();

  @Test
  void countTest() {
    char letter = 'a';
    assertEquals(
        getCountOfWordsThatEndsWith(String.valueOf(letter)),
        lastLetterCounter.count(getStringWithText(), letter)
    );
  }

  @Test
  void countTest_withUpperCase() {
    char lowerCaseLetter = 'a';
    char upperCaseLetter = 'A';

    assertEquals(
        getCountOfWordsThatEndsWith(String.valueOf(lowerCaseLetter)),
        lastLetterCounter.count(getStringWithText().toUpperCase(), lowerCaseLetter)
    );
    assertEquals(
        getCountOfWordsThatEndsWith(String.valueOf(lowerCaseLetter)),
        lastLetterCounter.count(getStringWithText(), upperCaseLetter)
    );
  }

  @Test
  void countTest_noLetterMatch() {
    char letter = 'x';
    assertEquals(0, lastLetterCounter.count(TEXT.toUpperCase(), letter));
  }

  @Test
  void countTest_noLetterMatchWithEmptySource() {
    char letter = 'y';
    assertEquals(0, lastLetterCounter.count(EMPTY_STRING, letter));
  }

  @ParameterizedTest
  @MethodSource("notValidChars")
  void countTest_ExceptionIfCharacterIsNotLetter(char notValidChar) {
    assertThrows(IllegalArgumentException.class, () -> lastLetterCounter.count(TEXT, notValidChar));
  }

  private long getCountOfWordsThatEndsWith(String letter) {
    return getTextFileString().stream()
        .map(str -> str.split("\\s"))
        .flatMap(Arrays::stream)
        .filter(str -> str.endsWith(letter))
        .count();
  }

  private String getStringWithText() {
    return String.join(" ", getTextFileString());
  }

  @SneakyThrows
  private List<String> getTextFileString() {
    return Files.readAllLines(
        Paths.get(
            getClass()
                .getClassLoader()
                .getResource("java.txt")
                .toURI()
        )
    );
  }
}
