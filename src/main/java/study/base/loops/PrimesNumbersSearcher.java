package study.base.loops;

import java.util.ArrayList;

import static java.lang.String.format;

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
        if(from < 0)
            from = 0;

        if (to < from) {
            throw new IllegalArgumentException(format("argument 'to': %d couldn't be bigger " +
                    "than 'from': %d", from, to));
        }

        if (to < 2) {
            throw new IllegalArgumentException(format("argument 'to' should be >= 2: %d", to));
        }

        return transformListToArray(isPrimeList(from, to, identifyPrimeNumbers(from, to)));
    }

    private boolean [] identifyPrimeNumbers (int from, int to) {

        boolean [] isPrime = new boolean[to + 1];

        for (int i = 0; i <= to; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 0; i * i <= to; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= to; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    private ArrayList<Integer> isPrimeList (int from, int to, boolean [] isPrime) {
        ArrayList <Integer> primeList = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            if (isPrime[i]) {
                if (i>= from && i<= to) {
                    primeList.add(i);
                }
            }
        }
        return primeList;
    }

    private int [] transformListToArray (ArrayList<Integer> primes) {
        int [] primesArr = new int [primes.size()];
        int count = 0;

        for(int i : primes){
            primesArr[count] = i;
            count++;
        }
        return primesArr;
    }
}
