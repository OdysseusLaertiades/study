package study.base.arrays.matrix;

/**
 * Implement method that search index of the row with maximum sum of elements.
 * If there are several such lines return one that was detected first
 *
 * find( new int[][]{ {6, 2, -6}, {0, 0, 13}, {-1, 6, 7}, {-3, -12, 21} });  →  1
 *
 * find( new int[][]{ {6, 2}, {1, 1},{6, 2} });  →  0
 */

public class MatrixMaxSumRow {

  public int find(int[][] matrix) {
    int maxSum = 0;
    int minSum = 0;
    int index = 0;
    int indexMaxSum = 0;

    for (int [] matrixLine : matrix){
      for (int number : matrixLine){
        minSum += number;
      }
      if (minSum > maxSum){
        maxSum = minSum;
        indexMaxSum = index;
      }
      index++;
      minSum = 0;
    }
    return indexMaxSum;
  }
}