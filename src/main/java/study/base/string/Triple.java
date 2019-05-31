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

    int count = 0;

    String withoutPunctAndWhitsp = source.replaceAll("(?U)[\\pP\\s]", "");

    for (int i = 0; i<withoutPunctAndWhitsp.length()-1; i++) {
      if (withoutPunctAndWhitsp.length() > 2 && withoutPunctAndWhitsp.charAt(i) == withoutPunctAndWhitsp.charAt(i + 1) &&
              withoutPunctAndWhitsp.charAt(i + 1) == withoutPunctAndWhitsp.charAt(i + 2)) {
        count++;
        i = i + 2;
      }
    }
    return count;
  }
}
