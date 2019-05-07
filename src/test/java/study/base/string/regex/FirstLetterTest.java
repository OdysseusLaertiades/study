package study.base.string.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import study.base.string.TestData;


class FirstLetterTest extends TestData {

  private final FirstLetter firstLetter = new FirstLetter();

  @Test
  void collect_onlyUpperCase() {
    assertEquals("LILI", firstLetter.collect(TEXT.concat(" ").concat(TEXT)));
  }

  @Test
  void collect_mixedCase() {
    assertEquals(
        "dLIliDli",
        firstLetter.collect(TAG
            .concat(EMPTY_STRING)
            .concat(TEXT)
            .concat(EMPTY_STRING)
            .concat(TEXT.toLowerCase())
            .concat(EMPTY_STRING)
            .concat(TAG.toUpperCase())
            .concat(EMPTY_STRING)
            .concat(TEXT.toLowerCase())
        )
    );
  }

  @Test
  void collect_numeric() {
    assertEquals("LIdLI", firstLetter.collect(TEXT.concat(" 8 8 " + TAG + " 8 8 ").concat(TEXT)));
  }

}
