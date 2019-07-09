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
        if (isMatrixNotSquare(matrix)) {
            throw new IllegalArgumentException("Matrix isn`t square");
        }
        return getCountOfMatches(matrix) == matrix.length;
    }

    private int getCountOfMatches(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j && matrix[i][j] == 1)
                    count++;
                if (i != j && matrix[i][j] != 0) {
                    count = -222;
                    break;
                }
            }
        }
        return count;
    }

    private boolean isMatrixNotSquare(int[][] matrix) {
        return matrix[0].length != matrix.length;
    }
}
