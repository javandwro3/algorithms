package pl.jwrabel.trainings.javandwro3.algorithms.simple;

/**
 * Created by jakubwrabel on 18.04.2017.
 */
public class Chars {
    public static void main(String[] args) {
        char c = '6';
        char c2 = 68; // == 'D'
        System.out.println((char)97); // ASCII(98) = 'a'

        // === ZADANIE === Wypisać litery a-z
        System.out.println("--- WYPISANIE LITER a-z");
        // Sposób 1
        for (int i = 97; i <= 122; i++) {
            System.out.println((char)i);

            char letter = (char)i;
            System.out.println(letter);
        }

        // Sposób 2
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)(i + 97);
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i]);
        }


    }
}
