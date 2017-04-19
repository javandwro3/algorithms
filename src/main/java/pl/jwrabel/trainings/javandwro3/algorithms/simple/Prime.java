package pl.jwrabel.trainings.javandwro3.algorithms.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jakubwrabel on 18.04.2017.
 */
public class Prime {
    public static void main(String[] args) {
        // sprawdzanie czy x jest liczbą pierwszą
        int x = 21;
        boolean isPrimary = isPrime(x);
        System.out.println(x + " is primary: " + isPrimary);

        // znalezienie wszystkich liczb pierwszych mniejszych od x
        System.out.println("LICZBY PIERWSZE MNIEJSZE OD 50");
        List<Integer> primesLessThan = findPrimeLessThan(50);

        for (int i = 0; i < primesLessThan.size(); i++) {
            int elem = primesLessThan.get(i);
            System.out.println(elem);
        }
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findPrimeLessThan(int x) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 2; i < x; i++) {
            boolean isPrime = isPrime(i);
            if (isPrime) {
                numbers.add(i);
            }
            // LUB
            if (isPrime(i)) {
                numbers.add(i);
            }
        }

        return numbers;
    }

    public static List<Integer> primeFactors(int x) {
        List<Integer> primeFactors = new ArrayList<>();
        List<Integer> primes = findPrimeLessThan(x);
        int index = 0;

        ////

        return primeFactors;
    }
}
