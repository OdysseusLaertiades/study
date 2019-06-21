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

  private String withChange;

  public String find(String source) {
    return findMostRepeatedLetter(withoutWhitespace(source));
  }

  private String withoutWhitespace (String source){
    return withChange = source.replaceAll(" ", "");
  }

  private String findMostRepeatedLetter(String byFind){
    int count = 1;
    int biggestCount = 0;
    String result = "";

    for (int i = 0; i < byFind.length(); i++){
      if(!Character.toString(byFind.charAt(i)).equals("")) {
        for (int j = i + 1; j < byFind.length(); j++){
          if (byFind.charAt(i) == byFind.charAt(j)) {
            count++;
          }
        }
      }
      if (count > biggestCount && count > 1){
        result = Character.toString(byFind.charAt(i));
        biggestCount = count;
      }
      count = 1;
    }
    return result;
  }

  public String without(String source) {
    return removeDuplicateLetters(withoutWhitespace(source)) > 0 ? withChange : source;
  }

  private int removeDuplicateLetters (String byRemove){
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