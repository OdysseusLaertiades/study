package study.base.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {

  private final SumCalculator sumCalculator = new SumCalculator();

  @Test
  void calculate_onlyPositives() {
    int[] array = new int[]{5, 1, 4, 2, 3, 6, 4, 8, 10};
    assertEquals(getSum(array), sumCalculator.calculate(array));
  }

  @Test
  void calculate_onlyNegatives() {
    int[] array = new int[]{-4, -2, -4, -2, -4, -8, -11};
    assertEquals(getSum(array), sumCalculator.calculate(array));
  }

  @Test
  void calculate_mixed() {
    int[] array = new int[]{2, 0, -81, 12, 0, 60, -1, 64, -30, 4, 11, -5};
    assertEquals(getSum(array), sumCalculator.calculate(array));
  }

  private int getSum(int... digits) {
    return IntStream.of(digits).sum();
  }
}
