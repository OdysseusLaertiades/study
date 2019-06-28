package study.base.arrays.matrix;

import static java.math.RoundingMode.DOWN;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import org.junit.jupiter.api.Test;
import util.function.Value;

class MatrixAverageCalculatorTest {

  private final MatrixAverageCalculator averageCalculator = new MatrixAverageCalculator();

  @Test
  void calculateRectangularMatrix() {
    Value.with(
        new int[][]{{1, 5, 4, 78}, {45, -100, 44, 3}, {0, 0, 0, 0}, {-6, -6, 1, 1}, {12, 92, -40, 15}},
        this::compare
    );
  }

  @Test
  void calculateTriangleMatrix() {
    Value.with(
        new int[][]{{1}, {2, 2}, {3, 3, 3}, {4, 4, 4, 4}, {5, 5, 5, 5, 5}},
        this::compare
    );
  }

  @Test
  void calculateIrregularMatrix() {
    Value.with(
        new int[][]{{1}, {1}, {}, {}, {}, {4, -3, -4, 4}},
        this::compare
    );
  }

  private void compare(int[][] matrix) {
    assertThat(
        mapToBigDecimal(arithmeticMean(matrix)),
        comparesEqualTo(mapToBigDecimal(averageCalculator.calculate(matrix)))
    );
  }

  private BigDecimal mapToBigDecimal(double source) {
    return BigDecimal.valueOf(source).setScale(5, DOWN);
  }

  private double arithmeticMean(int[][] matrix) {
    return getDoubleStream(matrix).sum() / getDoubleStream(matrix).count();
  }

  private DoubleStream getDoubleStream(int[][] matrix) {
    return Arrays.stream(matrix)
        .flatMapToInt(Arrays::stream)
        .asDoubleStream();
  }

}