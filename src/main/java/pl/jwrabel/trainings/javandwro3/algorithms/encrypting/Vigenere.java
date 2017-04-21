package pl.jwrabel.trainings.javandwro3.algorithms.encrypting;

import java.awt.*;

/**
 * Created by jakubwrabel on 21.04.2017.
 */
public class Vigenere {
    public static void main(String[] args) {
        System.out.println("--- SZYFR VIGENERE'A ---");

        String text = "Ala ma kota";
        String password = "pies";

        System.out.println("Szyfruję: " + text);
        String encrypted = encrypt(text, password);
        System.out.println("Zaszyfrowana wiadomość z hasłem " + password + ": " + encrypted);


        // przykładowe metody Stringa
        String tex = "sadsdsadadsa";
        String tex2 = new String();

        // NIGDY NIE UŻYWAMY == do porównywania Stringów
        tex.equals(tex2);

        String exampleText = "ABCDEF";
        exampleText.equals("ABC");
        char[] chars = exampleText.toCharArray();
        exampleText = exampleText.toLowerCase();
        exampleText = exampleText.toUpperCase();

        exampleText = exampleText.replaceAll("a", "b");

        String s = exampleText.substring(2); // "CDEF
        boolean contains = exampleText.contains("a");
        char c = exampleText.charAt(2); // 'C'
    }

    public static String encrypt(String text, String  password) {
        char[] letters = text.toCharArray();




        return new String(letters);
    }
}
