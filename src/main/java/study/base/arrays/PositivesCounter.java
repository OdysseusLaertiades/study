package study.base.arrays;

/**
 * Implement method that counting number of positive digits in the array
 *
 * count(new int[]{2, 0, -1, 44, -2, 5}) → 3
 * count(new int[]{-4, 0, -1, -9, -2, -5}) → 0
 */

public class PositivesCounter {

  public int count(int[] digits) {
    int count = 0;
    for (int index = 0; index < digits.length; index++){
      if (digits[index] > 0){
        count++;
      }
    }
    return count;
  }

}