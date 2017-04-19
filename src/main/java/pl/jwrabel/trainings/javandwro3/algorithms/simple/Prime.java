package pl.jwrabel.trainings.javandwro3.algorithms.simple;

import java.util.List;

/**
 * Created by jakubwrabel on 18.04.2017.
 */
public class Prime {
    public static void main(String[] args) {
        int x = 21;
        boolean isPrimary = isPrime(x);
        System.out.println(x + " is primary: " + isPrimary);
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static List<Integer> findPrimeLessThan(int x) {
        return null;
    }
}
