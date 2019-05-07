package study.base.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuplicateTest {

  private final Duplicate duplicate = new Duplicate();
  private static final String DUPLICATE_SOURCE = "fSsSkkkKkSpwieSSSyyyYyymSSSS";
  private static final String WITHOUT_DUPLICATE_SOURCE = "should";

  @Test
  void find() {
    assertEquals("S", duplicate.find(DUPLICATE_SOURCE));
  }

  @Test
  void find_noDuplicates() {
    assertEquals("", duplicate.find(WITHOUT_DUPLICATE_SOURCE));
  }

  @Test
  void find_withSpecialSymbols() {
    assertEquals("S", duplicate.find(getSourceWithSpecialSymbols(DUPLICATE_SOURCE)));
  }

  @Test
  void without() {
    assertEquals(
        DUPLICATE_SOURCE
            .replaceAll("S", "")
            .replaceAll("k", "")
            .replaceAll("y", ""),
        duplicate.without(DUPLICATE_SOURCE)
    );
  }

  @Test
  void without_noDuplicates() {
    assertEquals(WITHOUT_DUPLICATE_SOURCE, duplicate.without(WITHOUT_DUPLICATE_SOURCE));
  }

  @Test
  void without_noDuplicatesWithSpecialSymbols() {
    String source = getSourceWithSpecialSymbols(WITHOUT_DUPLICATE_SOURCE);
    assertEquals(source, duplicate.without(source));
  }

  private String getSourceWithSpecialSymbols(String source) {
    return " ;  : : :   "
        .concat(source)
        .concat("-,,-.-  ")
        .concat("  ... ; ,,,");
  }

}
