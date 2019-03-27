package study.base.string.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TagsTest {

  private final Tags tags = new Tags();
  private final StringBuilder sb = new StringBuilder();
  private final static String TAG = "div";
  private final static String TEXT = "Lorem Ipsum";
  private final static String EMPTY_STRING = "          ";

  @Test
  void markWithDivTagsTest() {
    assertEquals(
        expectedContent(),
        tags.makeTags("div", "Lorem Ipsum")
    );
  }

  @Test()
  void testException() {
    assertThrows(NullPointerException.class, () -> tags.makeTags(null, TEXT));
    assertThrows(NullPointerException.class, () -> tags.makeTags(TAG, null));
    assertThrows(NullPointerException.class, () -> tags.makeTags(null, null));
    assertThrows(IllegalArgumentException.class, () -> tags.makeTags(EMPTY_STRING, TEXT));
    assertThrows(IllegalArgumentException.class, () -> tags.makeTags(TAG, EMPTY_STRING));
    assertThrows(IllegalArgumentException.class, () -> tags.makeTags(EMPTY_STRING, EMPTY_STRING));
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