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

      toRemove.toUpperCase();
      source.toUpperCase();

      if (toRemove.charAt(0) == ' ' && !toRemove.equals(" ") || source.charAt(0) == ' '){
          throw new IllegalArgumentException("You sentence is not exist");
      }

      String newSTr = source.replace(toRemove,"");

    return newSTr;
  }
}

/* Its my First realization of task. All code is hand writing. For example.

String newSTr ="";
      int count = 0;
      for (int i = 0; i<source.length(); i++){

          if (source.charAt(i) == toRemove.charAt(0)){
              newSTr += source.subSequence(count, i);
              count = i+1;

          } if (i == source.length() - 1 && newSTr.length() < source.length()){
              newSTr += source.subSequence(count, source.length());
          }
      }*/