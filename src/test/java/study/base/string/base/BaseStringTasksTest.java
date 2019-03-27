package study.base.string.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BaseStringTasksTest {

  private final Tags tags = new Tags();
  private final WithoutEnd withoutEnd = new WithoutEnd();
  private final WithoutSymbols withoutSymbols = new WithoutSymbols();
  private final StringBuilder sb = new StringBuilder();
  private final static String TAG = "div";
  private final static String TEXT = "Lorem Ipsum";
  private final static String EMPTY_STRING = "          ";

  @Test
  void tagsTest() {
    assertEquals(
        expectedContent(),
        tags.makeTags("div", "Lorem Ipsum")
    );
  }

  @Test
  void testExceptionForTags() {
    assertThrows(NullPointerException.class, () -> tags.makeTags(null, TEXT));
    assertThrows(NullPointerException.class, () -> tags.makeTags(TAG, null));
    assertThrows(NullPointerException.class, () -> tags.makeTags(null, null));
    assertThrows(IllegalArgumentException.class, () -> tags.makeTags(EMPTY_STRING, TEXT));
    assertThrows(IllegalArgumentException.class, () -> tags.makeTags(TAG, EMPTY_STRING));
    assertThrows(IllegalArgumentException.class, () -> tags.makeTags(EMPTY_STRING, EMPTY_STRING));
  }

  @Test
  void testExceptionForWithoutEnd() {
    assertThrows(NullPointerException.class, () -> withoutEnd.withoutEnd(null));
    assertThrows(IllegalArgumentException.class, () -> withoutEnd.withoutEnd(EMPTY_STRING));
    assertThrows(IllegalArgumentException.class, () -> withoutEnd.withoutEnd("A"));
  }

  @Test
  void withoutEndTest() {
    assertEquals(
        String.valueOf(TAG.charAt(1)),
        withoutEnd.withoutEnd(TAG)
    );
  }

  @Test
  void testExceptionForWithoutSymbols() {
    assertThrows(NullPointerException.class, () -> withoutSymbols.without(null, TEXT));
    assertThrows(NullPointerException.class, () -> withoutSymbols.without(TAG, null));
    assertThrows(NullPointerException.class, () -> withoutSymbols.without(null, null));
    assertThrows(IllegalArgumentException.class, () -> withoutSymbols.without(EMPTY_STRING, TEXT));
    assertThrows(IllegalArgumentException.class, () -> withoutSymbols.without(TAG, EMPTY_STRING));
    assertThrows(IllegalArgumentException.class, () -> withoutSymbols.without(EMPTY_STRING, EMPTY_STRING));
  }

  @Test
  void withoutSymbolsTest() {
    assertEquals("Test", withoutSymbols.without("+", "++T+++e++s+t+++++++++++++"));
    assertEquals("LoremIpsum", withoutSymbols.without(" ", TEXT));
    assertEquals(TAG, withoutSymbols.without(TEXT, TAG));
    assertEquals("", withoutSymbols.without(TAG, TAG));
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