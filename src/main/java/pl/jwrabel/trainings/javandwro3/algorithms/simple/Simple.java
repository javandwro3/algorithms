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
//            temp = temp + 2;

            myArray[i] = temp;
        }

        // === ZADANIE ===
        // Stworzyć tablicę z wymyślonymi liczbami, znaleźć MIN i MAX


    }
}
