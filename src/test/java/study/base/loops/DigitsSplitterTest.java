package study.base.loops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigitsSplitterTest {

  private final DigitsSplitter digitsSplitter = new DigitsSplitter();

  @Test
  void split() {
    assertArrayEquals(
        convert(Integer.MAX_VALUE),
        digitsSplitter.split(Integer.MAX_VALUE)
    );
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
