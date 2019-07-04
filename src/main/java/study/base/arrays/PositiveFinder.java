package study.base.arrays;

/**
 * Implement methods which should search i of the first and last positive number in array. If there are no positive numbers, return -1.
 *
 * findFirstPositive(new int[]{-7, -2, 0, -4, 5, 1, -9}) →  4
 * findLastPositive(new int[]{-7, -2, 0, -4, 5, 1, -9}) →  5
 * findLastPositive(new int[]{-7, -2, 0, -4, -5, -1, -9}) →  -1
 */

public class PositiveFinder {

  public int findFirstPositive(int[] array) {
    int firstPositive = -1;
    for (int i = 0; i < array.length; i++){
      if (array[i] > 0){
        firstPositive = i;
        break;
      }
    }
    return firstPositive;
  }

  public int findLastPositive(int[] array) {
    int lastPositive = 0;
    for (int i = array.length-1; i > 0; i--){
      if (array[i] > 0){
        lastPositive = i;
        break;
      }
    }
    return lastPositive > 0 ? lastPositive : -1;
  }
}