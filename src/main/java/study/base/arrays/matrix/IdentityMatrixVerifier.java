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
        return getCountOfMatches(new Matrix(matrix)) == matrix.length;
    }

    private int getCountOfMatches(Matrix matrix) {
        int count = 0;
        for (int i = 0; i < matrix.depthSize(); i++) {
            for (int j = 0; j < matrix.fullSize(); j++) {
                count += matrix.getIdentityValueOrNegativeIfNotMatch(i, j);
            }
        }
        return count;
    }

    private boolean isMatrixNotSquare(int[][] matrix) {
        return matrix[0].length != matrix.length;
    }

    private class Matrix {

        private final int[][] array2D;

        private Matrix(int[][] array2D) {
            this.array2D = array2D;
        }

        private int getElementByIdx(int rowIdx, int lineIdx) {
            return array2D[rowIdx][lineIdx];
        }

        private int depthSize() {
            return array2D[0].length;
        }

        private int fullSize() {
            return array2D.length;
        }

        private int getIdentityValueOrNegativeIfNotMatch(int i, int j) {
            return isUnit(i, j) ? 1 : isNotIdentityState(i, j) ? Integer.MIN_VALUE : 0;
        }

        private boolean isUnit(int rowIdx, int lineIdx) {
            return rowIdx == lineIdx && getElementByIdx(rowIdx, lineIdx) == 1;
        }

        private boolean isNotIdentityState(int rowIdx, int lineIdx) {
            return rowIdx != lineIdx && getElementByIdx(rowIdx, lineIdx) != 0;
        }
    }
}
