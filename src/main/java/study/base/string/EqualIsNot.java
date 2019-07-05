package study.base.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number
 * of appearances of "not" anywhere in the string (case sensitive).
 *
 * check("This is not") → false
 * check("This is notNOT") → false
 * check("This is notnot") → true
 * check("noisxxnotyynotxisi") → true
 */

public class EqualIsNot {

  private static final String[] PATTERNS = {"IS", "is", "NOT", "not"};

  public boolean check(String source) {
    return isCountOfEntriesSame(countOfEntriesInString(source));
  }

  private long countOfEntriesInString(String source) {
    long count = 0;
    long prevCount = 0;
    for (String pattern : PATTERNS) {
      Matcher matcher = Pattern.compile(pattern).matcher(source);
      while (matcher.find()) {
        count += 1;
      }
      prevCount += count == prevCount ? count : -count;
    }
    return prevCount;
  }

  private boolean isCountOfEntriesSame(long byPattern) {
    return byPattern != 0 && byPattern % 2 == 0;
  }
}
