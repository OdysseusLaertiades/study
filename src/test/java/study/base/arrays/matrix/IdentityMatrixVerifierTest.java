package study.base.arrays.matrix;

import static org.apache.commons.math3.linear.MatrixUtils.createRealIdentityMatrix;
import static org.apache.commons.math3.linear.MatrixUtils.createRealMatrix;
import static org.junit.jupiter.api.Assertions.*;
import static util.ArraysUtil.convertDoubleArray;
import static util.function.Value.with;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class IdentityMatrixVerifierTest {

  private final IdentityMatrixVerifier identityMatrixVerifier = new IdentityMatrixVerifier();

  @Test
  void verifyCorrectIdentityMatrix() {
    with(
        convertDoubleArray(createRealIdentityMatrix(20).getData()),
        matrix -> assertTrue(identityMatrixVerifier.verify(matrix))
    );
  }

  @Test
  void verifyIncorrectIdentityMatrix() {
    with(
        convertDoubleArray(createRealIdentityMatrix(20).getData()),
        matrix -> {
          matrix[11][16] = -4;
          assertFalse(identityMatrixVerifier.verify(matrix));
        }
    );
  }

  @Test
  void verifyNotSquareMatrix() {
    with(
        convertDoubleArray(createRealMatrix(20, 21).getData()),
        matrix -> {
          fillMatrix(matrix, 1);
          assertThrows(IllegalArgumentException.class, () -> identityMatrixVerifier.verify(matrix));
        }
    );
  }

  private void fillMatrix(int[][] matrix, int val) {
    for (int[] arr : matrix) {
      Arrays.fill(arr, val);
    }
  }

}
