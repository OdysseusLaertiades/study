package study.base.string;

import lombok.RequiredArgsConstructor;

/**
 * Only tolerates letters a through z.
 * Cannot handle spaces, numbers, symbols or unicode.
 * Skip spaces
 * Only works with a positive number in the shift parameter.
 */

@RequiredArgsConstructor
public class CaesarCipher {

  private final int offset;

  public String encode(String source, int offset) {
    return null;
  }

  public String decode(String source, int offset) {
    return null;
  }

  public String[] bruteForce(String source, int minOffset, int maxOffset) {
    return null;
  }

}
