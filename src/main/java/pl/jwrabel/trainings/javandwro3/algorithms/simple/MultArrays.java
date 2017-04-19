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
        int[][] array55 = new int[5][5];
        for (int y = 0; y < array55[0].length; y++) {
            for (int x = 0; x < array55.length; x++) {
                array55[x][y] = 5;
            }
        }
        printArray(array55);


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
