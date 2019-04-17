package study.base.string.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WithoutEndTest extends TestData {

  private final WithoutEnd withoutEnd = new WithoutEnd();

  @Test
  void withoutEndTest() {
    assertEquals(
        String.valueOf(TAG.charAt(1)),
        withoutEnd.without(TAG)
    );
  }

  @Test
  void withoutEndTest_ShouldCorrectlyThrowException() {
    assertThrows(NullPointerException.class, () -> withoutEnd.without(null));
    assertThrows(IllegalArgumentException.class, () -> withoutEnd.without(EMPTY_STRING));
    assertThrows(IllegalArgumentException.class, () -> withoutEnd.without("A"));
  }
}
