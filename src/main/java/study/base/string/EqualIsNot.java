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

  private static final String PATTERN_IS = "IS";
  private static final String PATTERN_NOT = "NOT";
  private static final String PATTERN_is = "is";
  private static final String PATTERN_not = "not";

  public boolean check(String source) {

    return isCountOfEntriesSame(countOfEntriesInString(source, PATTERN_NOT),
            countOfEntriesInString(source,PATTERN_IS),
            countOfEntriesInString(source, PATTERN_not),
            countOfEntriesInString(source, PATTERN_is));
  }

  private static long countOfEntriesInString (String source, String pattern){
    long count = 0;
    Matcher matcher = Pattern.compile(pattern).matcher(source);
    while (matcher.find()){
      count += 1;
    }
    return count;
  }

  private boolean isCountOfEntriesSame (long byPatternNOT, long byPatternIS,
                                        long byPatternNot, long byPatternIs){
    return (byPatternNOT != 0 && byPatternIS != 0)
            && byPatternNOT == byPatternIS
            || ((byPatternNot != 0 && byPatternIS != 0)
            && byPatternNot == byPatternIS)
            || ((byPatternIs != 0 && byPatternNOT != 0)
            && byPatternIs == byPatternNOT)
            || ((byPatternIS != 0 && byPatternNOT != 0)
            && byPatternIS == byPatternNOT)
            || (byPatternNot != 0 && byPatternIs != 0)
            && byPatternNot == byPatternIs;

    // знаю, это решение ужасно, но более ничего не смог придумать.
    // Прошу твоей помощи в этой части задачи.
  }
}