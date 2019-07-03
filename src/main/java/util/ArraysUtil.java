package util;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class ArraysUtil {

  public static int[][] convertDoubleArray(double[][] arr) {
    return Arrays.stream(arr)
        .map(ArraysUtil::mapToIntArray)
        .toArray(int[][]::new);
  }

  public static int[] mapToIntArray(double[] arr) {
    return DoubleStream.of(arr)
        .boxed()
        .mapToInt(Double::intValue)
        .toArray();
  }

}
