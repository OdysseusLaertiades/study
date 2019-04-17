package study.base.string.base;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

class TestData {

  final StringBuilder sb = new StringBuilder();
  final static String TAG = "div";
  final static String TEXT = "Lorem Ipsum";
  final static String EMPTY_STRING = "          ";

  static Stream<Arguments> commonStringArgumentsAndExceptionsThatTheyCause() {
    return Stream.of(
        Arguments.of(NullPointerException.class, null, TEXT),
        Arguments.of(NullPointerException.class, TAG, null),
        Arguments.of(NullPointerException.class, null, null),
        Arguments.of(IllegalArgumentException.class, EMPTY_STRING, TEXT),
        Arguments.of(IllegalArgumentException.class, TAG, EMPTY_STRING),
        Arguments.of(IllegalArgumentException.class, EMPTY_STRING, EMPTY_STRING)
    );
  }
}
