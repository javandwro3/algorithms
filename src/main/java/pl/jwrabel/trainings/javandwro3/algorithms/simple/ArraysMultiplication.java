package pl.jwrabel.trainings.javandwro3.algorithms.simple;

/**
 * Created by jakubwrabel on 20.04.2017.
 */
public class ArraysMultiplication {
    public static void main(String[] args) {
        System.out.println("--- MNOŻENIE MACIERZY ----");
        int[][] matrixA = new int[][]{{1,2},{3,4}};
        int[][] matrixB = new int[][]{{5,6},{7,8}};

        System.out.println("Macierz A:");
        MultArrays.printArray(matrixA);

        System.out.println("Macierz B:");
        MultArrays.printArray(matrixB);


    }
}
