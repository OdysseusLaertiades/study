package study.base.loops;

/**
 * Implement method that return an array of primes from the specified range from..to. If arguments are invalid, throw IllegalArgumentException
 *
 * searchInRange(-5, 27) → [2, 3,	5, 7, 11,	13,	17,	19,	23]
 * searchInRange(450, 500) → [457, 461,	463, 467,	479, 487,	491, 499]
 * searchInRange(100, -1) → IllegalArgumentException
 * searchInRange(5, 1) → IllegalArgumentException
 */

public class PrimesNumbersSearcher {

  public int[] searchInRange(int from, int to) {
      if (isFromBiggestOfTo(from, to)) {
          throw new IllegalArgumentException("Arguments are invalid");
      }
      return searchPrimes(from, to);
  }

    private boolean isFromBiggestOfTo (int from, int to){
        return to < from;
    }

  private int [] searchPrimes (int from, int to){
      int indexOfArray = 0;
      int[] search = new int[countPrimes(from, to)];
      for (int i = from; i < to; i++) {
          if(i < 2)
              continue;
          if (isPrimeNumber(i)) {
              search[indexOfArray] = i;
              indexOfArray++;
          }
      }
      return search;
  }

    private int countPrimes(int from, int to) {
        int count = 0;
        for (int i = from; i < to; i++) {
            if(i < 2)
                continue;
            if (isPrimeNumber(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrimeNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
