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

    try{
      source.toUpperCase();

      if(source.contains(" ") || source.length()<2){
        throw new IllegalArgumentException();
      }

    } catch(NullPointerException e){
      System.out.println("Error! You word is null!");
      return source;

    } catch(IllegalArgumentException ex){
      System.out.println("Error! You word is not legal!");
      return source;
    }
    return source.substring(1,source.length()-1);
  }

}
