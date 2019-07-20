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
      throw new IllegalArgumentException("Size of your array less or equals of 0");
    }
    int[] array = new int[size];
    for (int i = 0; i < array.length; i++){
      array [i] = i;
    }
    return array;
  }
}
