package study.base.arrays;

import java.util.Arrays;

/**
 * Implement method that fill an array with the specified filler value
 *
 * fill(new String[5], "A") → ["A", "A", "A", "A", "A"]
 */

public class Filler {

  public void fill(String [] array, String filler){
    Arrays.fill(array, filler);
  }
}