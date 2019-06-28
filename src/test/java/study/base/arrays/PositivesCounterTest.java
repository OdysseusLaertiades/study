package study.base.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PositivesCounterTest {

  private final PositivesCounter positivesCounter = new PositivesCounter();

  @Test
  void countWithPositives() {
    int[] source = new int[]{0, 6, 0, 0, 0, -4, -70, 0, 0, -15};
    assertEquals(1, positivesCounter.count(source));
  }

  @Test
  void countWithoutPositives() {
    int[] source = new int[]{0, -6, 0, 0, 0, -4, -5, -4, 0, -5};
    assertEquals(0, positivesCounter.count(source));
  }

}
