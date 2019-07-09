package study.base.arrays.matrix;

/**
 * Implement matrix transposition method. Original matrix should not be changed
 *
 * transpose( new int[][]{ {6, 2, -6}, {0, 0, 13} });  →  { {6, 0}, {2, 0}, {-6, 13} }
 */

public class MatrixTransposer {

  public int[][] transpose(int[][] matrix) {
    int[][] transportedMatrix = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        transportedMatrix [j][i] = matrix [i][j];
      }
    }
    return transportedMatrix;
  }
}
