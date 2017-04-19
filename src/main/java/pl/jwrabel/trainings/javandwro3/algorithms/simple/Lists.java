package pl.jwrabel.trainings.javandwro3.algorithms.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 19.04.2017.
 */
public class Lists {
    public static void main(String[] args) {
        // Stworzenie listy
        List<Integer> myList = new ArrayList<>();

        // dodanie elementu do listy
        myList.add(1);
        myList.add(10);
        myList.add(20);

        // wyciąganie konkretny element
        // listy są indeksowane tak jak tablice! od 0
        // analogiczne do array[0]
        int elem0 = myList.get(0);
        int elem1 = myList.get(1);

        // sprawdzenie rozmiaru
        // analogiczne do array.length
        int listSize = myList.size();
    }
}
