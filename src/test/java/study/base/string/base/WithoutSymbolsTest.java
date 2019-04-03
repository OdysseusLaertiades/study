package study.base.string.base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WithoutSymbolsTest extends BaseStringTest {

  private final WithoutSymbols withoutSymbols = new WithoutSymbols();

  @Test
  void withoutSymbolsTest() {
    assertEquals("Test", withoutSymbols.without("+", "++T+++e++s+t+++++++++++++"));
    assertEquals("LoremIpsum", withoutSymbols.without(" ", TEXT));
    assertEquals(TAG, withoutSymbols.without(TEXT, TAG));
    assertEquals("", withoutSymbols.without(TAG, TAG));
  }

  @Test
  void withoutSymbolsTest_ShouldCorrectlyThrowException() {
    assertThrows(NullPointerException.class, () -> withoutSymbols.without(null, TEXT));
    assertThrows(NullPointerException.class, () -> withoutSymbols.without(TAG, null));
    assertThrows(NullPointerException.class, () -> withoutSymbols.without(null, null));
    assertThrows(IllegalArgumentException.class, () -> withoutSymbols.without(EMPTY_STRING, TEXT));
    assertThrows(IllegalArgumentException.class, () -> withoutSymbols.without(TAG, EMPTY_STRING));
    assertThrows(IllegalArgumentException.class, () -> withoutSymbols.without(EMPTY_STRING, EMPTY_STRING));
  }
}
