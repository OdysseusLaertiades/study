package study.base.string;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.*;
import static study.base.string.TestData.ALPHABET_STRING;
import static study.base.string.TestData.TEXT;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SumDigitsTest {

  private final SumDigits sumDigits = new SumDigits();

  @Test
  void calculate_SourceWithNoise() {
    int[] digits = {9, 4, 9, 8, 4, 6, 1, 0, 0, 5, 8, 7, 8, 9, 8, 7};
    assertEquals(
        calculateSum(digits),
        sumDigits.calculate(generateNoisySource(digits))
    );
  }

  @Test
  void calculate_SourceWithoutNoise() {
    int[] digits = {2, 3, 4, 2, 3, 4, 2, 3, 4, 2, 3, 4, 2, 3, 4, 2, 3, 4};
    assertEquals(
        calculateSum(digits),
        sumDigits.calculate(concatDigits(digits))
    );
  }

  @Test
  void calculate_WithoutDigits() {
    assertEquals(0, sumDigits.calculate(TEXT));
  }

  private int calculateSum(int... digits) {
    return Arrays.stream(digits).sum();
  }

  private String generateNoisySource(int... digits) {
    return Arrays.stream(digits)
        .mapToObj(this::geDigitWithNoise)
        .collect(joining());
  }

  private String geDigitWithNoise(int digit) {
    return randomString(digit / 2) + digit;
  }

  private String randomString(int count) {
    StringBuilder builder = new StringBuilder();
    while (count-- != 0) {
      builder.append(ALPHABET_STRING.charAt(getIndex()));
    }
    return builder.toString();
  }

  private int getIndex() {
    return (int) (Math.random() * ALPHABET_STRING.length());
  }

  private String concatDigits(int... digits) {
    return Arrays.stream(digits)
        .mapToObj(String::valueOf)
        .collect(joining());
  }
}
