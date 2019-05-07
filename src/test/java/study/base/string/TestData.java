package study.base.string;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import util.TextFileReader;

public class TestData {

  protected static final String TAG = "div";
  protected static final String TEXT = "Lorem Ipsum";
  protected static final String EMPTY_STRING = "          ";
  protected static final String ALPHABET_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  protected final TextFileReader textFileReader = new TextFileReader();

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

  static Stream<Arguments> notValidChars() {
    return Stream.of(
        Arguments.of('1'),
        Arguments.of('%'),
        Arguments.of(','),
        Arguments.of('\n')
    );
  }
}
