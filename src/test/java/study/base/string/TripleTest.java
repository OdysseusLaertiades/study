package study.base.string;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class TripleTest {

  private final Triple triple = new Triple();

  @Test
  void count_withoutCaseSensitive() {
    int count = 3;
    assertEquals(count, triple.count(generateSource(count, 'd')));
  }

  @Test
  void count_withCaseSensitive() {
    int countOfLowerTriple = 3;
    int countOfUpperTriple = 2;
    String source = generateSource(countOfLowerTriple, 'o').concat(generateSource(countOfUpperTriple, 'I'));
    assertEquals(countOfLowerTriple + countOfUpperTriple, triple.count(source));
  }

  @Test
  void count_withNumeric() {
    int count = 5;
    assertEquals(count, triple.count(generateSource(count, '9')));
  }

  @Test
  void count_withPunctuationAndWhitespaces() {
    int countOfTripledSpecificSymbols = 2;

    String source = generateSource(countOfTripledSpecificSymbols, ',')
        .concat(generateSource(countOfTripledSpecificSymbols, '.'))
        .concat(generateSource(countOfTripledSpecificSymbols, ' '))
        .concat(generateSource(countOfTripledSpecificSymbols, '-'));

    assertEquals(0, triple.count(source));
  }

  @Test
  void count_withoutTriples() {
    assertEquals(0, triple.count(addNoiseToTriple("")));
  }

  @Test
  void count_withOneMoreLetterAddedToTriple() {
    char letter = 'A';
    String source = addNoiseToTriple(tripleLetter(letter).concat(String.valueOf(letter)));

    assertEquals(1, triple.count(source));
  }

  @Test
  void count_twoTriplesNear() {
    char letter = 'A';
    String source = addNoiseToTriple(tripleLetter(letter).concat(tripleLetter(letter)));

    assertEquals(2, triple.count(source));
  }

  private String generateSource(int count, char letter) {
    return IntStream.range(0, count)
        .mapToObj(i -> tripleLetter(letter))
        .map(this::addNoiseToTriple)
        .collect(joining());
  }

  private String addNoiseToTriple(String triple) {
    String noise = "1sdfssaawqeqxz4";
    return noise
        .concat(triple)
        .concat(noise);
  }

  private String tripleLetter(char letter) {
    return IntStream.range(0, 3)
        .mapToObj(i -> String.valueOf(letter))
        .collect(joining());
  }

}
