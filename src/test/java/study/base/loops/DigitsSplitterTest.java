package study.base.loops;

import static org.junit.jupiter.api.Assertions.*;
import static util.function.Value.with;

import org.junit.jupiter.api.Test;

class DigitsSplitterTest {

  private final DigitsSplitter digitsSplitter = new DigitsSplitter();

  @Test
  void split() {
    with(Integer.MAX_VALUE, decimal -> assertArrayEquals(convert(decimal), digitsSplitter.split(decimal)));
  }

  private int[] convert(int numeric) {
    return Integer.toString(numeric)
        .chars()
        .map(this::getIntFromChar)
        .toArray();
  }

  private int getIntFromChar(int c) {
    return c - '0';
  }

}
