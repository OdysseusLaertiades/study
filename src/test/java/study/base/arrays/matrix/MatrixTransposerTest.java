package study.base.arrays.matrix;

import static java.lang.String.format;
import static java.util.Arrays.deepEquals;
import static java.util.Arrays.deepToString;
import static org.apache.commons.math3.linear.MatrixUtils.createRealMatrix;
import static org.junit.jupiter.api.Assertions.*;

import static util.ArraysUtil.convertDoubleArray;
import static util.function.Value.map;
import static util.function.Value.with;

import org.junit.jupiter.api.Test;
import util.ArraysUtil;

class MatrixTransposerTest {

  private final MatrixTransposer matrixTransposer = new MatrixTransposer();

  @Test
  void transpose() {
    with(
        new double[][]{{4, 2, 2, 6, 4, 1}, {0, 1, 0, 9, 9, 9}, {6, -4, 6, 3, 4, 3}},
        matrix -> {
          int[][] expected = transposeMatrix(matrix);
          int[][] actual = matrixTransposer.transpose(convertDoubleArray(matrix));
          assertTrue(
              deepEquals(expected, actual),
              () -> fail(format(" \n Arrays not equal. \n Expected: %s  \n Actual: %s \n", deepToString(expected), deepToString(actual)))
          );
        });
  }

  private int[][] transposeMatrix(double[][] source) {
    return map(createRealMatrix(source).transpose().getData(), ArraysUtil::convertDoubleArray);
  }

}