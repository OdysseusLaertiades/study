package study.base.string;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class WithoutSymbolsTest extends TestData {

  private final WithoutSymbols withoutSymbols = new WithoutSymbols();

  @Test
  void withoutSymbolsTest() {
    String toRemove = "+";
    assertEquals(TEXT, withoutSymbols.without(toRemove, getStringSourceWithNoise(toRemove, TEXT)));
  }

  @Test
  void withoutSymbolsTest_removeWhiteSpace() {
    assertEquals(
        TEXT.replaceAll("\\s", ""),
        withoutSymbols.without(" ", TEXT)
    );
  }

  @Test
  void withoutSymbolsTest_argumentToRemoveNotMatch() {
    assertEquals(TAG, withoutSymbols.without(TEXT, TAG));
  }

  @Test
  void withoutSymbolsTest_argumentCompletelyRemovesSource() {
    assertEquals("", withoutSymbols.without(TAG, TAG));
  }

  @ParameterizedTest
  @MethodSource("commonStringArgumentsAndExceptionsThatTheyCause")
  void withoutSymbolsTest_ShouldCorrectlyThrowException(
      Class<? extends Exception> exceptionClass,
      String firstArgument,
      String secondArgument
  ) {
    assertThrows(exceptionClass, () -> withoutSymbols.without(firstArgument, secondArgument));
  }

  private String getStringSourceWithNoise(String noise, String source) {
    String increasedNoise = getIncreasedNoise(noise, 4);
    char[] chars = source.toCharArray();
    return IntStream.range(0, source.length())
        .mapToObj(i -> getConcat(increasedNoise, chars[i]))
        .collect(joining());
  }

  private String getConcat(String increasedNoise, char c) {
    return increasedNoise
        .concat(String.valueOf(c))
        .concat(increasedNoise);
  }

  private String getIncreasedNoise(String noise, int length) {
    return IntStream.range(0, length)
        .mapToObj(i -> noise)
        .collect(joining());
  }
}
