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

  public boolean check(String source) {

    Pattern pattern = Pattern.compile("IS|is");
    Matcher matcher = pattern.matcher(source);

    int countIs = 0, countNot = 0;

    while (matcher.find()){
      countIs++;
    }

    pattern = Pattern.compile("NOT|not");
    matcher = pattern.matcher(source);

    while (matcher.find()){
      countNot++;
    }

    if(countIs == countNot && countIs != 0) return true;
    
    return false;
  }

}
