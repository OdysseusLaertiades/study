package study.base.arrays;

/**
 * Implement method that calculates sum of all digits in array
 *
 * calculate(new int[]{5, 0 , 4 , 6 , 2, 4}) → 21
 * calculate(new int[]{5, 0 , 4 , 6 , 2, 4, -20}) → 1
 */

public class SumCalculator {

  public int calculate(int[] digits){
    int sum = 0;
    for (int number : digits){
      sum += number;
    }
    return sum;
  }
}
