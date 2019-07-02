package study.base.arrays.matrix;

import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.*;

import static util.function.Value.map;
import static util.function.Value.with;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import org.apache.commons.math3.linear.MatrixUtils;
import org.junit.jupiter.api.Test;

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
              Arrays.deepEquals(expected, actual),
              () -> fail(format(" \n Arrays not equal. \n Expected: %s  \n Actual: %s \n", Arrays.deepToString(expected), Arrays.deepToString(actual)))
          );
        });
  }

  private int[][] transposeMatrix(double[][] source) {
    return map(MatrixUtils.createRealMatrix(source).transpose().getData(), this::convertDoubleArray);
  }

  private int[][] convertDoubleArray(double[][] arr) {
    return Arrays.stream(arr)
        .map(this::mapToIntArray)
        .map(int[]::clone)
        .toArray(int[][]::new);
  }

  private int[] mapToIntArray(double[] arr) {
    return DoubleStream.of(arr)
        .boxed()
        .mapToInt(Double::intValue)
        .toArray();
  }

}