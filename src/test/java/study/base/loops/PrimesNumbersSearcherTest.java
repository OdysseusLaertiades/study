package study.base.loops;

import static org.junit.jupiter.api.Assertions.*;
import static util.function.Value.with;

import java.util.AbstractMap.SimpleEntry;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.commons.math3.primes.Primes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class PrimesNumbersSearcherTest {

  private final PrimesNumbersSearcher primesNumbersSearcher = new PrimesNumbersSearcher();

  @Test
  void searchInRange() {
    with(new SimpleEntry<>(-5000, 8698542), pair ->
        assertArrayEquals(
            arrayFilledWithPrimes(pair.getKey(), pair.getValue()),
            primesNumbersSearcher.searchInRange(pair.getKey(), pair.getValue())
        ));
  }

  @Test
  void searchInRangeWithoutPrimes() {
    with(new SimpleEntry<>(24, 28), pair ->
        assertArrayEquals(
            arrayFilledWithPrimes(pair.getKey(), pair.getValue()),
            primesNumbersSearcher.searchInRange(pair.getKey(), pair.getValue())
        ));
  }

  @ParameterizedTest
  @MethodSource("illegalArguments")
  void searchInRangeWithIllegalArguments(int from, int to) {
    assertThrows(IllegalArgumentException.class, () -> primesNumbersSearcher.searchInRange (from, to));
  }

  static Stream<Arguments> illegalArguments() {
    return Stream.of(
        Arguments.of(5000, -50),
        Arguments.of(600, 599)
    );
  }

  private int[] arrayFilledWithPrimes(int from, int to) {
    return IntStream.range(from, to)
        .filter(Primes::isPrime)
        .toArray();
  }

}
