package pl.jwrabel.trainings.javandwro3.algorithms.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 18.04.2017.
 */
public class PrimeAlgorithmsComparison {
    public static void main(String[] args) {
        int x = 10_000_000;
        System.out.println("Test dla X: " + x);

        long start = System.nanoTime();
        Prime.eratosthenesSieve(x);
        long duration = System.nanoTime() - start;
        double durationInSeconds = duration / 1_000_000_000d;
        System.out.println("Czas trwania sita Eratostenesa:\t" + durationInSeconds);

        long start2 = System.nanoTime();
        Prime.findPrimeLessThan(x);
        long duration2 = System.nanoTime() - start2;
        double durationInSeconds2 = duration2 / 1_000_000_000d;
        System.out.println("Czas trwania 'zwykłego' algorytmu:\t" + durationInSeconds2);
    }

}
