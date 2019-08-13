package study.base.loops;

/**
 * Implement method that return an array of digits of given integer. In solution shouldn't be used convert numeric to string
 *
 * split(54543574) → [5, 4, 5, 4, 3, 5, 7, 4]
 */

public class DigitsSplitter {

  public int[] split(int numeric) {
    int[] parseNumbers = new int[(int) Math.log10(numeric) + 1];
    for (int i = (int) Math.log10(numeric); i >= 0; i--) {
      parseNumbers[i] = numeric % 10;
      numeric /= 10;
    }
    return parseNumbers;
  }
}
