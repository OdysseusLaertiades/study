package study.base.arrays;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class SequenceCreatorTest {

  private final SequenceCreator sequenceCreator = new SequenceCreator();

  @Test
  void create() {
    int expectedSize = 10;
    int[] result = sequenceCreator.create(10);
    assertEquals(expectedSize, result.length);
    assertArrayEquals(expectedElements(expectedSize), result);
  }

  @Test
  void createWithException() {
    assertThrows(IllegalArgumentException.class, () -> sequenceCreator.create(-100));
    assertThrows(IllegalArgumentException.class, () -> sequenceCreator.create(0));
  }

  private int[] expectedElements(int size) {
    return IntStream.range(0, size).toArray();
  }

}
