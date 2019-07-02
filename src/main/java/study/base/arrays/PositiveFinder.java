package study.base.arrays;

/**
 * Implement methods which should search index of the first and last positive number in array. If there are no positive numbers, return -1.
 *
 * findFirstPositive(new int[]{-7, -2, 0, -4, 5, 1, -9}) →  4
 * findLastPositive(new int[]{-7, -2, 0, -4, 5, 1, -9}) →  5
 * findLastPositive(new int[]{-7, -2, 0, -4, -5, -1, -9}) →  -1
 */

public class PositiveFinder {

  public int findFirstPositive(int[] array) {
    int firstPositive = 0;
    for (int index = 0; index < array.length; index++){
      if (array[index] > 0){
        firstPositive = index;
        break;
      }
    }
    return firstPositive > 0 ? firstPositive : -1;
  }

  public int findLastPositive(int[] array) {
    int lastPositive = 0;
    for (int index = array.length-1; index > 0; index--){
      if (array[index] > 0){
        lastPositive = index;
        break;
      }
    }
    return lastPositive > 0 ? lastPositive : -1;
  }
}