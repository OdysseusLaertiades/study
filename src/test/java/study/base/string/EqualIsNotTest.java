package study.base.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EqualIsNotTest {

  private final EqualIsNot equalIsNot = new EqualIsNot();

  @Test
  void check_withoutCaseSensitive() {
    assertTrue(equalIsNot.check("This is notnot"));
    assertTrue(equalIsNot.check("noisxxnotyynotxisi"));
  }

  @Test
  void check_withCaseSensitive() {
    assertTrue(equalIsNot.check("ThIS IS notnot"));
    assertTrue(equalIsNot.check("ThIS IS notnotis"));
  }

  @Test
  void check_NotEquals() {
    assertFalse(equalIsNot.check("ThIS is notnot"));
    assertFalse(equalIsNot.check("is notnot"));
    assertFalse(equalIsNot.check("This is not notis"));
  }

}
