package study.base.string;


/**
 * We'll say that a "triple" in a string is a char appearing three times in a row.
 * Return the number of triples in the given string.  Punctuation and whitespaces should be ignored
 *
 * count("abcXXXabc") → 1
 * count("xxxabyyyycd") → 2
 * count("xxxabYYycd") → 1
 * count("xxxabyyyyyyycd") → 3
 * count("a") → 0
 */

public class Triple {

  public int count(String source) {

    String clearStr = source.replaceAll("(?U)[\\pP\\s]", "");
    return isNextTripleLetterCount(clearStr);
  }

  public static int isNextTripleLetterCount(String sourceStr){

    int count = 0;
    for (int indexOfLetter = 0; indexOfLetter < sourceStr.length()-1; indexOfLetter++) {
      if (sourceStr.length() > 2
              && sourceStr.charAt(indexOfLetter) == sourceStr.charAt(indexOfLetter + 1)
              && sourceStr.charAt(indexOfLetter + 1) == sourceStr.charAt(indexOfLetter + 2)){

        count++;
        indexOfLetter = indexOfLetter + 2;
      }
    }
    return count;
  }
}