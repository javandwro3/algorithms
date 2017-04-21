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

        // czynniki pierwsze liczby 54
        System.out.println("Czynniki pierwsze liczby 54");
        List<Integer> primeFactors = primeFactors(54);

        for (int i = 0; i < primeFactors.size(); i++) {
            System.out.println(primeFactors.get(i));
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

    public static List<Integer> eratosthenesSieve(int x) {
        int[] array = new int[x + 1];

        // wypełnienie tablicy liczbami 0, 1, 2...x
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 2; i < x / 2; i++) {
            if (array[i] != 0) {

                for (int j = 2 * i; j < array.length; j += i) {
                    array[j] = 0;
                }

            }
        }

        List<Integer> result = new ArrayList<>();
        for (int elem : array) {
            if (elem > 1) {
                result.add(elem);
            }
        }

        return result;
    }

    public static List<Integer> primeFactors(int x) {
        List<Integer> primeFactors = new ArrayList<>();
        List<Integer> primes = findPrimeLessThan(x);
        int index = 0;

        while (x > 1) {
            int currentPrimeNumber = primes.get(index);
            if (x % currentPrimeNumber == 0) {
                primeFactors.add(currentPrimeNumber);
                x = x / currentPrimeNumber;
//                x /= currentPrimeNumber;
            } else {
                index++;
            }
        }

        return primeFactors;
    }
}
