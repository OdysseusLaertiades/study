package study.base.string;

import static java.lang.String.format;

/**
 * Given a string that contains some text. Count the number of words ending with selected char (not case sensitive).
 *
 * count("Lorem ipsum", 'm') → 2
 * count("Lore ipsuM", 'm') → 1
 * count("matching meaning", 'm') → 0
 * count("", 'a') → 0
 *
 * if character is not letter - throw IllegalArgumentException
*/

public class LastLetterCounter {

  public long count(String source, char letter) {

      if (!Character.isLetter(letter)){
          throw new IllegalArgumentException(format("Given character '%s' is not a letter", letter));
      }
      long sum = 0;

      for(String s : source.split("\\s")){
          if (s.toLowerCase().endsWith(Character.toString(letter).toLowerCase())){
              sum++;
          }
      }
    return sum;
  }
}
