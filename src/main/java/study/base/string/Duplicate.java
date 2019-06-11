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

  public String find(String source) {

    StringBuilder sb = new StringBuilder();
    int count = 1, biggest = 0;
    String result = "";

    sb.append(source.replaceAll(" ", ""));

    for (int i = 0; i < sb.length(); i++){
      if(Character.toString(sb.charAt(i)).equals(result) == false) {
        for (int j = i + 1; j < sb.length(); j++){
          if (sb.charAt(i) == sb.charAt(j)) {
            count++;
          }
        }
      }
      if (count > biggest && biggest != count && count > 1){
        result = Character.toString(sb.charAt(i));
        biggest = count;
      }
      count = 1;
    }

    return result;
  }

  public String without(String source) {

<<<<<<< HEAD
}
=======
    if (!source.contains("\\W")) {

      source = source.replaceAll(" ", "");

      for (int i = 0; i < source.length(); i++) {
        for (int j = i + 1; j < source.length(); j++) {
          if (source.charAt(i) == source.charAt(j)) {
            source = source.replaceAll(Character.toString(source.charAt(i)), "");
          }
        }
      }
      return source;
    } else {
      return source;
    }
  }
}

>>>>>>> New
