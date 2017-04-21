package pl.jwrabel.trainings.javandwro3.algorithms.simple;

/**
 * Created by jakubwrabel on 21.04.2017.
 */
public class Recursion {
    public static int sum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        sumRecursive(5);
    }


    public static int sumRecursive(int x) {
        if (x > 1) {
            return x + sumRecursive(x - 1);
        } else {
            return 1;
        }
    }

    public static int factorial(int x) {
        int factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i; // factorial = factorial * i;
        }
        return factorial;
    }

    public static int factorialRecursive(int x) {
        if (x > 1) {
            return x * factorialRecursive(x - 1);
        } else {
            return 1;
        }
    }

    public static int multiply(int x, int y) {
        if (y > 0 && x > 0) {
            return x + multiply(x, y - 1);
        } else {
            return 0;
        }
        // LUB
//        if (y == 1) {
//            return x;
//        } else {
//            return x + multiply(x, y - 1);
//        }
    }

    // największy wspólny dzielnik
    public static int gcd(int k, int n) {
        if (k > 0) {
            return gcd(n % k, k);
        } else {
            return n;
        }
    }


    public static int fibonacci(int n) {
        if (n < 3) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacciWiki(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciWiki(n - 1) + fibonacciWiki(n - 2);
        }
    }
}



