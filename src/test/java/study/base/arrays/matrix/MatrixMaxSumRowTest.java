package study.base.arrays.matrix;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;
import static util.function.Value.map;
import static util.function.Value.with;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class MatrixMaxSumRowTest {

  private final MatrixMaxSumRow matrixMaxSumRow = new MatrixMaxSumRow();

  @Test
  void findInRectangularMatrix() {
    with(
        new int[][]{{14, -66, 79}, {28, -6, -6, 40}, {-4, -6, -6, 16}, {20, -2, 6, 13}},
        matrix -> assertEquals(getMaxIdx(matrix), matrixMaxSumRow.find(matrix))
    );
  }

  @Test
  void findInTriangleMatrix() {
    with(
        new int[][]{{14, 4}, {11, 12, -9}, {140, -80, 14, 20}, {1, 2, 16, 13, 40}},
        matrix -> assertEquals(getMaxIdx(matrix), matrixMaxSumRow.find(matrix))
    );
  }

  @Test
  void findInIrregularMatrix() {
    with(
        new int[][]{{}, {}, {5}, {}, {4, 2, -2}, {2, 7, 6, -10}},
        matrix -> assertEquals(getMaxIdx(matrix), matrixMaxSumRow.find(matrix))
    );
  }

  @Test
  void findInEmptyMatrix() {
    with(
        new int[][]{{}, {}, {}, {}, {}, {}},
        matrix -> assertEquals(getMaxIdx(matrix), matrixMaxSumRow.find(matrix))
    );
  }

  @Test
  void findInMatrixWithSeveralEqualLines() {
    with(
        new int[][]{{1, 4, 9}, {}, {1, 4, 9}, {24}, {2, 2, 2, 2}, {2, 4, 9, -5, 7, 7}, {2, 2, 2, 2}},
        matrix -> assertEquals(getMaxIdx(matrix), matrixMaxSumRow.find(matrix))
    );
  }

  private int getMaxIdx(int[][] matrix) {
    return map(getLinesSum(matrix), linesSum -> linesSum.indexOf(findMax(linesSum)));
  }

  private int findMax(List<Integer> lst) {
    return lst.stream()
        .mapToInt(Integer::intValue)
        .max()
        .orElse(0);
  }

  private List<Integer> getLinesSum(int[][] matrix) {
    return Arrays.stream(matrix)
        .map(this::calculateSum)
        .collect(toList());
  }

  private int calculateSum(int[] arr) {
    return IntStream.of(arr).sum();
  }

}
