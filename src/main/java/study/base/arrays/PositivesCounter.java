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
    for (int i = 0; i < digits.length; i++){
      if (digits[i] > 0){
        count++;
      }
    }
    return count;
  }
}
