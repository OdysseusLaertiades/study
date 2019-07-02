package study.base.arrays;

/**
 * Implement method that create an array of given size, filled with values ​​from 0 to size-1.
 * If size <= 0, throw IllegalArgumentException exception.
 *
 * create(5) → [0, 1, 2, 3, 4]
 * create(-4) → IllegalArgumentException
 */

public class SequenceCreator {

  public int[] create(int size) {
    if (size <= 0) {
      throw new IllegalArgumentException();
    }
    int[] array = new int[size];
    for (int index = 0; index < array.length; index++){
      array [index] = index;
    }
    return array;
  }
}