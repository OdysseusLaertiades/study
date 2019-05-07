package study.base.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class TagsTest extends TestData {

  private final Tags tags = new Tags();

  @Test
  void markMethodTest() {
    assertEquals(
        expectedContent(),
        tags.mark(TAG, TEXT)
    );
  }

  @ParameterizedTest
  @MethodSource("commonStringArgumentsAndExceptionsThatTheyCause")
  void markMethodTest_ShouldCorrectlyThrowException(
      Class<? extends Exception> exceptionClass,
      String firstArgument,
      String secondArgument
  ) {
    assertThrows(exceptionClass, () -> tags.mark(firstArgument, secondArgument));
  }

  private static String expectedContent() {
    return "<"
        .concat(TAG)
        .concat(">")
        .concat(TEXT)
        .concat("</")
        .concat(TAG)
        .concat(">");
  }
}
