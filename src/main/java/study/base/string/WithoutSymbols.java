package study.base.string;

/**
 * remove all entered symbols from given string, return the string without those symbols,
 * and otherwise return the string unchanged. This is a little harder than it looks.
 *
 * without("x,xHi") → "Hi"
 * without("x,Hxix") → "Hi"
 * without("test","Hi") → "Hi"
 * without("Hi","Hi") → ""
 *
 * Should throw NullPointerException if one of arguments is null or IllegalArgumentException if empty
 */

public class WithoutSymbols {

  public String without(String toRemove, String source) {
      if (toRemove.trim().isEmpty() && !toRemove.equals(" ") || source.trim().isEmpty()){
          throw new IllegalArgumentException("Empty string was passed!");
      }
    return source.replace(toRemove,"");
  }
}
