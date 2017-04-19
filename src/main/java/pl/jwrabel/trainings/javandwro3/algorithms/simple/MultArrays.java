package pl.jwrabel.trainings.javandwro3.algorithms.simple;

/**
 * Created by jakubwrabel on 19.04.2017.
 */
public class MultArrays {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};

        // TABLICE DWUWYMIAROWE
        int[][] arrayTest = new int[3][2];

        // pierwszy element tablicy dwuwymiarowej to TABLICA!
        int[] innerArray = arrayTest[0];
        int i = innerArray[1];


        i = arrayTest[0][1];

        // sposób wypisywania - tablica wewnętrzna = wiersz
        int[][] arrayMult = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        // przejście po tablicy dwuwymiarowej
        for (int x = 0; x < arrayMult.length; x++) {
            int[] inner = arrayMult[x];

            for (int y = 0; y < inner.length; y++) {
                System.out.print(inner[y] + " ");
            }
            System.out.println();
        }

        // Wypisywanie - wewnętrzna tablica jako kolumna
        printArray(arrayMult);


        // --- ZADANIE --- stworzenie tablicy 5x5, wypełnienie
        // 1 2 3 4 5
        // 1 2 3 4 5
        // ...
        System.out.println("---------------------------");

        int[][] array5x5 = new int[5][5];

        for (int y = 0; y < array5x5[0].length; y++) {
            for (int x = 0; x < array5x5.length; x++) {
                array5x5[x][y] = x + 1;
            }
        }

        printArray(array5x5);


        // --- ZADANIE --- stworzenie tablicy 5x5, wypełnienie
        // 1 2 3 4 5
        // 2 3 4 5 6
        // 3 4 5 6 7
        // ...
        System.out.println("---------------------------");
        for (int y = 0; y < array5x5[0].length; y++) {
            for (int x = 0; x < array5x5.length; x++) {
                array5x5[x][y] = x + 1 + y;
            }
        }

        printArray(array5x5);


        // --- ZADANIE --- stworzenie tablicy 5x5, wypełnienie
        // 1 2 3 4 5
        // 6 7 8 9 10
        // 11 12 13 14 15
        // ...
        System.out.println("---------------------------");

        for (int y = 0; y < array5x5[0].length; y++) {
            for (int x = 0; x < array5x5.length; x++) {
                array5x5[x][y] = 1;
            }
        }

        printArray(array5x5);
    }

    public static void printArray(int[][] array) {
        for (int y = 0; y < array[0].length; y++) {
            for (int x = 0; x < array.length; x++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }
}
