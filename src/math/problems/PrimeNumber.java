package math.problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */

        System.out.println(sumPrime2());

    }

    public static long sumPrime2() {
        List<Long> primes = new ArrayList<>();
        primes.add(1L);
        primes.add(2L);
        long primeSum = 5;

        for (long primeCandidate = 1000000; primeCandidate < 2000000; primeCandidate = primeCandidate + 2) {
            boolean isCandidatePrime = true;
            double sqrt = Math.sqrt(primeCandidate);
            for (int i = 0; i < primes.size(); i++) {
                Long prime = primes.get(i);
                if (primeCandidate % prime == 0) {
                    isCandidatePrime = false;
                    break;
                }
                if (prime > sqrt) {
                    break;
                }
            }
            if (isCandidatePrime) {
                primes.add(primeCandidate);
                primeSum += primeCandidate;
            }
            System.out.println(primeCandidate);
        }
        System.out.println(primes.size());
        return primeSum;
    }



    }