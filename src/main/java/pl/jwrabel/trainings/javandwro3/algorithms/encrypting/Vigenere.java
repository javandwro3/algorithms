package pl.jwrabel.trainings.javandwro3.algorithms.encrypting;

import pl.jwrabel.trainings.javandwro3.algorithms.simple.MultArrays;

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

    public static String encrypt(String text, String password) {
        char[] letters = text.toLowerCase().toCharArray();


        // GENEROWANIE TABLICY VIGENERE'A
        char[][] vigenereArray = new char[26][26];

        for (int y = 0; y < vigenereArray[0].length; y++) {
            for (int x = 0; x < vigenereArray.length; x++) {
//                vigenereArray[x][y] = (char) (97 + x + y);
//
//                if (vigenereArray[x][y] > 97 + 25) {
//                    vigenereArray[x][y] -= 26;
//                }

                // LUB
                vigenereArray[x][y] = (char) (97 + (x + y) % 26);
            }
        }
        printArray(vigenereArray);

        // GENEROWANIE HASŁA O ODPOWIEDNIEJ DŁUGOSCI
        char[] passwordShort = password.toLowerCase().toCharArray();
        char[] passwordLong = new char[letters.length];

        for (int i = 0; i < passwordLong.length; i++) {
            passwordLong[i] = passwordShort[i % passwordShort.length];
            System.out.println(passwordLong[i]);
        }

        // SZYFROWANIE
        for (int i = 0; i < letters.length; i++) {
            char charFromText = letters[i];
            char charFromPassword = passwordLong[i];
            System.out.println("Para " + charFromText + " : " + charFromPassword);

            if (charFromText != ' ') {
                int indexX = charFromText - 97;
                int indexY = charFromPassword - 97;
                letters[i] = vigenereArray[indexX][indexY];
            }
        }


        return new String(letters);
    }

    public static void printArray(char[][] array) {
        for (int y = 0; y < array[0].length; y++) {
            for (int x = 0; x < array.length; x++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }
}
