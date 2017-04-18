package pl.jwrabel.trainings.javandwro3.algorithms.simple;

/**
 * Created by jakubwrabel on 18.04.2017.
 */
public class Simple {
    public static void main(String[] args) {
        // tworzymy tablicę o wielkości 100 (tablica intów)
        // wypełniamy liczbami parzystymi
        // 2 4 6...
        int[] myArray = new int[100];

        // ROZWIĄZANIE 1
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 2 + 2;
        }

        // ROZWIĄZANIE 1.5
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (i + 1) * 2;
        }

        // ROZWIĄZANIE 2
        myArray[0] = 2;
        for (int i = 1; i < myArray.length; i++) {
            myArray[i] = myArray[i - 1] + 2;
        }

        // ROZWIĄZANIE 3
        int temp = 0;
        for (int i = 0; i < myArray.length; i++) {
            temp += 2;
//          temp = temp + 2;

            myArray[i] = temp;
        }

        // === ZADANIE ===
        // Stworzyć tablicę z wymyślonymi liczbami, znaleźć MIN i MAX
        // * w jednej pętli
        int[] myArray1 = new int[3];
        myArray1[0] = 5;
        myArray1[1] = 10;
        myArray1[2] = 7;

        int[] array = new int[]{2, 5, 6, 1, 4, 2};
        int[] myArray3 = {2, 5, 6, 1, 4, 2};


        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // === ZADANIE === Stworzyć tablicę i wypełnić
        // odwrócić tablicę
        int[] arrayToReverse = new int[]{5, 3, 1};
        int[] reversedArray = new int[arrayToReverse.length];

        // Sposób 1 - nowa tablica
        // wypisanie tablicy
        System.out.println("--- SPOSÓB 1 ---");
        System.out.println("TABLICA DO ODWRÓCENIA");
        for (int i = 0; i < arrayToReverse.length; i++) {
            System.out.println(arrayToReverse[i]);
        }

        // Rozwiązanie 1
        int maxIndex = arrayToReverse.length - 1;
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = arrayToReverse[maxIndex - i];
        }

        System.out.println("TABLICA ODWRÓCONA");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }

        // Sposób 2 - zamiana miejscami elementów 1 tablicy

        // przykład - ZAMIANA array[0] z array[2]
        int tmp = array[0];
        array[0] = array[2];
        array[2] = tmp;

        int[] array2 = {10, 7, 3, 4,1};
        System.out.println("--- SPOSÓB 2 ---");
        int maxIndex2 = array2.length-1;
        for (int i = 0; i < array2.length/2; i++) {
            // zamienić miejscami
//            arrayToReverse2[i] z arrayToReverse2[4-i]
            int tmpVar = array2[i];
            array2[i] = array2[maxIndex2-i];
            array2[maxIndex2-i] = tmpVar;
        }

    }
}
