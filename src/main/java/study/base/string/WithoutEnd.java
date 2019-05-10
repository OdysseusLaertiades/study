package study.base.string;

/**
 * Given a string, return a version without the first and last char, so "Hello" yields "ell".
 * The string length will be at least 2.
 *
 *
 * without("Hello") → "ell"
 * without("java") → "av"
 * without("coding") → "odin"
 *
 * Should throw NullPointerException if one of arguments is null or IllegalArgumentException if empty
 * or have bad condition
 */

public class WithoutEnd {

  public String without(String source) {


      if(source.contains(" ") || source.length() < 2){
        throw new IllegalArgumentException("Error! You word is not wrong!");
      }

      return source.substring(1,source.length()-1);
  }

}
