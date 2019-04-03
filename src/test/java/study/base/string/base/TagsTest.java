package study.base.string.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TagsTest extends BaseStringTest {

  private final Tags tags = new Tags();

  @Test
  void markMethodTest() {
    assertEquals(
        expectedContent(),
        tags.mark(TAG, TEXT)
    );
  }

  @Test
  void markMethodTest_ShouldCorrectlyThrowException() {
    assertThrows(NullPointerException.class, () -> tags.mark(null, TEXT));
    assertThrows(NullPointerException.class, () -> tags.mark(TAG, null));
    assertThrows(NullPointerException.class, () -> tags.mark(null, null));
    assertThrows(IllegalArgumentException.class, () -> tags.mark(EMPTY_STRING, TEXT));
    assertThrows(IllegalArgumentException.class, () -> tags.mark(TAG, EMPTY_STRING));
    assertThrows(IllegalArgumentException.class, () -> tags.mark(EMPTY_STRING, EMPTY_STRING));
  }

  private String expectedContent() {
    return sb
        .append("<")
        .append(TAG)
        .append(">")
        .append(TEXT)
        .append("</")
        .append(TAG)
        .append(">")
        .toString();
  }
}
