package study.base.arrays.matrix;

/**
 * Implement method that define ​​identity matrix. Original matrix should not be changed.
 * If matrix isn`t square, throw an IllegalArgumentException exception.
 *
 * verify( new int[][]{ {1, 0, 0}, {0, 1, 0}, {0, 0, 1} } );  →  true
 * verify( new int[][]{ {1, 2, 0}, {0, 1, 0}, {0, 0, 1} } );  →  false
 * verify( new int[][]{ {1, 2, 0}, {0, 1, 0}, {0, 0, 1}, {0, 0, 0} } );  →  IllegalArgumentException
 */

public class IdentityMatrixVerifier {

  public boolean verify(int[][] matrix) {
    int [] [] matrixChange = matrix;
    boolean result = false;
    int count = 0;

    if (matrixChange[0].length != matrixChange.length){
      throw new IllegalArgumentException();
    }
    for (int i = 0; i<matrixChange[0].length; i++){
      for (int j = 0; j<matrixChange.length; j++){
        if (i == j && matrixChange [i][j] == 1)
          count++;
        if (i != j && matrix [i][j] != 0)
          return false;
      }
    }
    if (count == matrixChange.length){
      result = true;
    }
    return result;
  }
}
