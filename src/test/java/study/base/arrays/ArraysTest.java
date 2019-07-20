package study.base.arrays;

import static java.util.Arrays.copyOf;
import static org.junit.jupiter.api.Assertions.*;
import static util.function.Value.with;

import java.util.Random;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class ArraysTest {

  private static final int ARR_SIZE = 100000;
  private static final int CONTENT = 4;
  private static final int FIND_ME = 35425;

  @Test
  void quickSort() {
    with(generateArray(), array -> assertArrayEquals(sort(array), with(array, Arrays::quickSort)));
  }

  @Test
  void quickSortWithOneElement() {
    with(new int[]{CONTENT}, array -> assertArrayEquals(array, with(array, Arrays::quickSort)));
  }

  @Test
  void quickSortWithDuplicateElements() {
    with(generateFilledArray(CONTENT), array -> assertArrayEquals((array), with(array, Arrays::quickSort)));
  }

  @Test
  void insertionSort() {
    with(generateArray(), array -> assertArrayEquals(sort(array), with(array, Arrays::insertionSort)));
  }

  @Test
  void insertionWithOneElement() {
    with(new int[]{CONTENT}, array -> assertArrayEquals(array, with(array, Arrays::insertionSort)));
  }

  @Test
  void insertionWithDuplicateElements() {
    with(generateFilledArray(CONTENT), array -> assertArrayEquals((array), with(array, Arrays::insertionSort)));
  }

  @Test
  void mergeSort() {
    with(generateArray(), array -> assertArrayEquals(sort(array), with(array, Arrays::mergeSort)));
  }

  @Test
  void mergeSortWithOneElement() {
    with(new int[]{CONTENT}, array -> assertArrayEquals(array, with(array, Arrays::mergeSort)));
  }

  @Test
  void mergeSortWithDuplicateElements() {
    with(generateFilledArray(CONTENT), array -> assertArrayEquals((array), with(array, Arrays::mergeSort)));
  }

  @Test
  void binarySearch() {
    with(
        generateArrayWithRange(-ARR_SIZE, ARR_SIZE),
        array -> assertEquals(find(array, FIND_ME), Arrays.binarySearch(array, FIND_ME))
    );
  }

  @Test
  void binarySearchNotFound() {
    with(
        generateArrayWithRange(-ARR_SIZE, ARR_SIZE),
        array -> {
          array[find(array, FIND_ME)] = 0;
          assertEquals(-1, Arrays.binarySearch(array, FIND_ME));
        });
  }

  @Test
  void binarySearchWithNotSortedArray() {
    with(
        new int[]{6, 23, 777, -1, 4, -60, 45, 0},
        array -> assertEquals(-1, Arrays.binarySearch(array, 777))
    );
  }

  @Test
  void binarySearchWithEmptyArray() {
    with(new int[]{}, array -> assertEquals(-1, Arrays.binarySearch(array, 3)));
  }

  private int find(int[] source, int findMe) {
    return java.util.Arrays.binarySearch(source, findMe);
  }

  private int[] sort(int[] arr) {
    return with(copyOf(arr, arr.length), java.util.Arrays::sort);
  }

  private int[] generateArray() {
    return new Random().ints(ARR_SIZE, -13000, 400000).toArray();
  }

  private int[] generateArrayWithRange(int from, int to) {
    return IntStream.range(from, to).toArray();
  }

  private int[] generateFilledArray(int content) {
    return with(new int[ARR_SIZE], array -> java.util.Arrays.fill(array, content));
  }

}
