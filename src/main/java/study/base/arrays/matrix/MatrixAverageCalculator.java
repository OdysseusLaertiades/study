package study.base.arrays.matrix;

/**
 * Implement method that calculate arithmetic mean of all elements of the matrix.
 *
 * calculate( new int[][]{ {6, 2, -6}, {0, 0, 13}, {-1, 6, 7}, {-3, -12, 21} });  →  2.75
 *
 * calculate( new int[][]{ {6, 2}, {1} });  →  3
 */

public class MatrixAverageCalculator {

  public double calculate(int[][] matrix) {
    double sumOfNumber = 0;
    double matrixSumLenght = 0;
    for (int [] matrixLine : matrix){
      for (int matrixNumb : matrixLine){
        sumOfNumber += matrixNumb;
        matrixSumLenght++;
      }
    }
    return sumOfNumber / matrixSumLenght;
  }
}
