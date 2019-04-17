package study.base.string.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class WithoutSymbolsTest extends TestData {

  private final WithoutSymbols withoutSymbols = new WithoutSymbols();

  @Test
  void withoutSymbolsTest() {
    assertEquals("Test", withoutSymbols.without("+", "++T+++e++s+t+++++++++++++"));
    assertEquals("LoremIpsum", withoutSymbols.without(" ", TEXT));
    assertEquals(TAG, withoutSymbols.without(TEXT, TAG));
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
}
