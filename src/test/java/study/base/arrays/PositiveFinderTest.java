package study.base.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositiveFinderTest {

  private final static int[] DIGITS = {0, -2, 1, 2, -6, 4, -50, -10};
  private final PositiveFinder positiveFinder = new PositiveFinder();

  @Test
  private void findFirstPositive() {
    assertEquals(2, positiveFinder.findFirstPositive(DIGITS));
  }

  @Test
  private void findLastPositive() {
    assertEquals(5, positiveFinder.findLastPositive(DIGITS));
  }

  @Test
  private void firstAndLastIsSame() {
    int[] sourceWithOnePositiveDigit = {-4, -3, 642, 0, -900, -4, -4, 0, 0, -9, -5, -7, 0};
    assertEquals(2, positiveFinder.findFirstPositive(sourceWithOnePositiveDigit));
    assertEquals(2, positiveFinder.findLastPositive(sourceWithOnePositiveDigit));
  }

  @Test
  private void noPositiveDigits() {
    int[] sourceWithoutPositiveDigits = {0, -1, 0, 0, -6, -9, 0, -6, -3, -4, 0};
    assertEquals(-1, positiveFinder.findFirstPositive(sourceWithoutPositiveDigits));
    assertEquals(-1, positiveFinder.findLastPositive(sourceWithoutPositiveDigits));
  }

}
