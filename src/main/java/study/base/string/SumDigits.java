package study.base.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
 * characters. Return 0 if there are no digits in the string.
 *
 * calculate("aa1bc2d3") → 6
 * calculate("aa11b33") → 8
 * calculate("Chocolate") → 0
 */

public class SumDigits {

  public int calculate(String source) {

    Pattern pattern = Pattern.compile("\\d");
    Matcher matcher = pattern.matcher(source);

    int count = 0;

    while(matcher.find()){
      count += Integer.parseInt(source.substring(matcher.start(),matcher.end()));
    }
    return count;
  }

}
