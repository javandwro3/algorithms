package pl.jwrabel.trainings.javandwro3.algorithms.encrypting;

/**
 * Created by jakubwrabel on 21.04.2017.
 */
public class Caesar {
    public static void main(String[] args) {
        System.out.println("--- SZYFR CEZARA ---");

        String text = "Ala ma kota";
        int offset = 4;

        System.out.println("Szyfruję: " + text);
        String encrypted = encrypt(text, offset);
        System.out.println("Zaszyfrowana wiadomość z przesunięciem " + offset + ": " + encrypted);

    }

    public static String encrypt(String text, int offset) {
        char[] letters = text.toCharArray();

        //

        return new String(letters);
    }
}
