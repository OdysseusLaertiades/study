package study.base.string;

/**
 * find - method should find the letter in the string that occurs most often, if there are none - return empty string,
 * if several letters have the same number of repetitions, return one that was detected first. Ignore whitespaces and punctuation. Case sensitive
 * without - method should return source string without all duplicate letters. Ignore whitespaces and punctuation. Case sensitive
 *
 * find("without") → "t"
 * find("letters") → "e"
 * find("lEtters") → "t"
 * find("the")→ ""
 *
 * without("letters") → "lrs";
 * without("leTters") → "lTtrs";
 */

public class Duplicate {

  static final StringBuilder sb = new StringBuilder();

  public String find(String source) {

    sb.append(source.replaceAll(" ", ""));
    return findMostRepeatedLetter(sb);
  }

  public static String findMostRepeatedLetter(StringBuilder sb){

    int count = 1, biggestCount = 0;
    String result = "";
    for (int i = 0; i < sb.length(); i++){
      if(!Character.toString(sb.charAt(i)).equals("")) {
        for (int j = i + 1; j < sb.length(); j++){
          if (sb.charAt(i) == sb.charAt(j)) {
            count++;
          }
        }
      }
      if (count > biggestCount && count > 1){
        result = Character.toString(sb.charAt(i));
        biggestCount = count;
      }
      count = 1;
    }
    return result;
  }

  public static String withChange;
  public String without(String source) {

    withChange = source.replaceAll(" ", "");

    if (removeDuplicateLetters(withChange) > 0){
      return withChange;
    } else return source;
  }

  public static int removeDuplicateLetters (String str){

    int  count = 0;
    for (int i = 0; i<withChange.length(); i++){
      if (Character.isLetter(withChange.charAt(i))) {
        for (int j = i + 1; j < withChange.length(); j++) {
          if (withChange.charAt(i) == withChange.charAt(j)) {
            withChange = withChange.replaceAll(Character.toString(withChange.charAt(i)), "");
            count++;
          }
        }
      }
    } return count;
  }
}
