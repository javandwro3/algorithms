package pl.jwrabel.notatki;

import java.util.Random;
import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {
        // TABLICE
        // deklaracja tablicy
        int[] tablica;
        // podobnie jak typów prostych - nie można jej używać dopóki się nie zainicjalizuje, w typ przypadku pusta
        tablica = new int[10];

        int[] tablica2 = new int[10];

        // tworzenie i wypełnienie danymi
        int[] tablica3 = new int[]{1, 2, 3};

        // długość tablicy
        System.out.println(tablica.length);

        // tablice są numerowane od 0 tj. tablica o długości 3 ma elementy o indeksach 0,1,2
        int[] tablica4 = new int[3];
        // elementy tej tablicy
        int element1 = tablica4[0];
        int element2 = tablica4[1];
        int element3 = tablica4[2];
        int element4 = tablica4[3]; // !!! BŁĄD, przekroczenie zakresu tablicy

        // Stworzenie tablicy oraz wypisanie jej pętlą for
        int[] tablicaDoWypisania = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Element tablicy o indeksie " + i + ": " + tablicaDoWypisania[i]);
        }
        // lub inny sposób
        for (int i = 0; i < tablicaDoWypisania.length; i++) {
            System.out.println("Element tablicy o indeksie " + i + ": " + tablicaDoWypisania[i]);
        }

        // Zainicjowanie tablicy danymi wartościami i wypisanie
        int[] tablicaZainicjowana = new int[]{1, 10, 5, 8, 7};
        for (int i = 0; i < tablicaZainicjowana.length; i++) {
            System.out.println("Element tablicy o indeksie " + i + ": " + tablicaZainicjowana[i]);
        }

        // Stworzenie pustej tablicy, wypełnienie jej pętlą, wypisanie
        int[] tablicaDoWypelnienia = new int[10];
        for (int i = 0; i < tablicaDoWypelnienia.length; i++) {
            tablicaDoWypelnienia[i] = 100;
        }
        for (int i = 0; i < tablicaDoWypelnienia.length; i++) {
            System.out.println("Element tablicy o indeksie " + i + ": " + tablicaDoWypelnienia[i]);
        }

        // === ZADANIE === stwórz tablicę o zadanej wielkości, wypełnij kolejnymi liczbami naturalnymi oraz wypisz
        // === ZADANIE === stwórz tablicę o zadanej wielkości, wypełnij kwadratami kolejnych liczb naturalnych oraz wypisz
        // === ZADANIE === stwórz tablicę o zadanej wielkości, wypełnij ciągiem 1, -2, 3, -4, 5, 6 oraz wypisz
        System.out.println("Podaj długość tablicy: ");
        int dlugoscTablicy2 = new Scanner(System.in).nextInt();

        int[] tworzonaTablica = new int[dlugoscTablicy2];

        // wypełnienie
        for (int i = 0; i < tworzonaTablica.length; i++) {
            if (i % 2 == 0) {
                tworzonaTablica[i] = (i + 1);
            } else {
                tworzonaTablica[i] = -(i + 1);
            }
        }

        // === ZADANIE === odwróć tablicę
        char[] tablicaDoOdwrocenia = new char[]{'a', 'b', 'c'};
        char[] odwroconaTablica = new char[tablica.length];

        for (int i = 0; i < odwroconaTablica.length; i++) {
            odwroconaTablica[i] = tablicaDoOdwrocenia[tablica.length - i - 1];
        }

        for (int i = 0; i < odwroconaTablica.length; i++) {
            System.out.println(odwroconaTablica[i]);
        }
        // === ZADANIE === wypełnienie liczbami parzystymi
        // === ZADANIE === ciąg fibonacciego
        // === ZADANIE === wypisz x liczb y (do 10)

        // === ZADANIE === utwórz tablicę o zadanej wielkości i zadanej zawartosci
        // === ZADANIE === utwórz dwie tablice o zadanych wielkościach, dodaj, obsłuż sytuację, gdy nie zgadzają się wymiary
        // === ZADANIE === wypisanie dwóch tablic, jednej poziomo a drugiej pionowo
        // === ZADANIE === mnożenie dwóch tablic, wczytaj zawartości tablic od użytkownika


        // szablon IntelliJ: <nazwa_szablonu>.fori -> stworzenie pętli do iterowania po tablicy

        // Pętla FOR-EACH - przykład na tablicy
        // Pętla foreach służy do przechodzenia po tablicy
        // !!! pętla foreach służy wyłącznie do odczytywania wartości, nie można jej używać do zmiany zawartości tablicy !!!!
        for (int wartosc : tablica) {
            // ciało zostanie wykonane tyle razy, jaka jest długość tablicy
            // w każdej iteracji zmienna wartość ma przypisaną wartość kolejnego elementu tablicy
        }
        // przykład
        for (char znak : odwroconaTablica) {
            System.out.println(znak);
        }

        // szablon IntelliJ: tablica.for -> stworzenie pętli foreach do przechodzenia po tabeli


        // === ZADANIE === stworzyć tablicę o zadanej długości
        // wypełnić ją kwadratami 1, 4, 9, 16, 25
        // wypisać
        int[] tablicaKwadratow = new int[10];
        // wypełnienie
        for (int i = 0; i < tablicaKwadratow.length; i++) {
            tablicaKwadratow[i] = (i + 1) * (i + 1);
        }
        // wypisanie
        for (int i = 0; i < tablicaKwadratow.length; i++) {
            System.out.println(tablicaKwadratow[i]);
        }
        System.out.println("----------------");


        // === ZADANIE === Wypełnienie tablicy znakami ASCII a-zA-Z
        int kodLiterya = 97;
        int kodLiteryz = 122;
        int kodLiteryDuzeA = 65;
        int kodLiteryDuzeZ = 90;

        char[] tablicaZnakowMalych = new char[kodLiteryz - kodLiterya + 1];
        for (int i = 0; i < tablicaZnakowMalych.length; i++) { // 0 1 2 3
            tablicaZnakowMalych[i] = (char) (kodLiterya + i);
        }

        char[] tablicaZnakowDuzych = new char[kodLiteryDuzeZ - kodLiteryDuzeA + 1];
        for (int i = 0; i < tablicaZnakowDuzych.length; i++) { // 0 1 2 3
            tablicaZnakowDuzych[i] = (char) (kodLiteryDuzeA + i);
        }

        int iloscZnakowMalych = (kodLiteryz - kodLiterya + 1);
        int iloscZnakowDuzych = (kodLiteryDuzeZ - kodLiteryDuzeA + 1);
        char[] tablicaZnakow =
                new char[iloscZnakowMalych + iloscZnakowDuzych];

        for (int i = 0; i < iloscZnakowMalych; i++) {
            tablicaZnakow[i] = (char) (kodLiterya + i);
        }

        for (int i = iloscZnakowMalych; i < tablicaZnakow.length; i++) { // 0 1 2
            tablicaZnakow[i] = (char) (kodLiteryDuzeA + i - iloscZnakowMalych);
        }

        for (int i = 0; i < tablicaZnakow.length; i++) {
            System.out.println(tablicaZnakow[i]);
        }

        // === ZADANIE === utworzyc tablice o dlugosci 10
        // i losowych wartościach
        // znaleźć wartość maksymalną i minimalną
        // wypisać

        /// wypełnienie tablicy losowymi liczbami
        int[] tablicaLosowa = new int[10];
        for (int i = 0; i < tablicaLosowa.length; i++) {
            tablicaLosowa[i] = new Random().nextInt(1000);
        }

        // wyszukanie minimum
        int min = tablicaLosowa[0];
        for (int i = 1; i < tablicaLosowa.length; i++) {
            if (tablicaLosowa[i] < min) {
                min = tablicaLosowa[i];
            }
        }

        for (int i = 0; i < tablicaLosowa.length; i++) {
            System.out.println(tablicaLosowa[i]);
        }

        System.out.println("Wartość minimalna: " + min);


        // === ZADANIE === dodanie tablic
        int[] tablicaDoDodania1 = new int[]{10, 20, 50};
        int[] tablicaDoDodania2 = new int[]{15, 56, 158};
        int[] suma = new int[tablicaDoDodania1.length];

        for (int i = 0; i < tablicaDoDodania1.length; i++) {
            suma[i] = tablicaDoDodania1[i] + tablicaDoDodania2[i];
        }

        for (int i = 0; i < suma.length; i++) {
            System.out.println(suma[i]);
        }

        // TABLICE DWUWYMIAROWE --  tablica tablic
        // inicjalizacja {{1,2,3}, {2,3,4}, {4,5,6}}
        int[][] tablicaDwuwymiarowa = new int[10][10];
        int pobranaWartosc = tablicaDwuwymiarowa[1][2];

        int[][] tablicaDwuwymiarowa2 = new int[][]{{1, 2}, {3, 4}};
        for (int x = 0; x < tablicaDwuwymiarowa2.length; x++) {
            for (int y = 0; y < tablicaDwuwymiarowa2[x].length; y++) {
                System.out.print(tablicaDwuwymiarowa2[x][y] + " ");
            }
            System.out.println();
        }


        // === ZADANIE === tablica dwuwymiarowa 5 x 8, wypełnij losowymi liczbami do 1000
        // === ZADANIE === wypisanie jako pole szachownicy
        // === ZADANIE === utworzenie tablicy o podanych rozmiarach, wypełnienie jej pytając użytkownika
        // === ZADANIE === wypełnienie
        // 1 2 3 4 5
        // 2 3 4 5 6
        // 3 4 5 6 7
        // === ZADANIE === "odwrócenie" tablicy
        // === ZADANIE === transpozycja macierzy
        // === ZADANIE === wyznacznik macierzy 3x3
        // 1. ręcznie
        // 2. pętlą
        // === ZADANIE === mnożenie tablic dwuwymiarowych
        //
        // === ZADANIE === kółko i krzyżyk
        // 0. Wypisanie planszy
        // 1. wczytanie współrzędnych i zmiana planszy
        // 2. w kółko
        // 3. rozróżnienie na graczy
        // 4. sprawdzenie zwycięstwa


        // ROZWIĄZANIE ZADANIA - MNOŻENIE MACIERZY

        // MNOŻENIE MACIERZY 3X3 * 3X3
        double[][] tab1 = new double[][]{{1, 2, 3}, {1, 2, 3}, {3, 3, 4}};
        double[][] tab2 = new double[][]{{3, 3, 4}, {1, 2, 3}, {5, 4, 6}};
        double[][] wynikowa = new double[tab1.length][tab1.length];

        System.out.println("Macierz tab1");
        for (int i = 0; i < tab1.length; i++) {
            double[] tablicaWewnetrzna = tab1[i];
            for (int j = 0; j < tablicaWewnetrzna.length; j++) {
                System.out.print(tablicaWewnetrzna[j] + " ");
            }
            System.out.println();
        }

        System.out.println("Macierz tab2");
        for (int i = 0; i < tab2.length; i++) {
            double[] tablicaWewnetrzna = tab2[i];
            for (int j = 0; j < tablicaWewnetrzna.length; j++) {
                System.out.print(tablicaWewnetrzna[j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------");


        for (int i = 0; i < wynikowa.length; i++) {
            for (int j = 0; j < wynikowa[i].length; j++) {
                System.out.println("I: " + i + " J: " + j);

                double[] wierszTablicy1 = tab1[i];

                double[] kolumnaTablicy2 = new double[tab2.length];

                for (int k = 0; k < kolumnaTablicy2.length; k++) {
                    kolumnaTablicy2[k] = tab2[k][j];
                }

                double sumaIloczynow = 0;
                for (int k = 0; k < kolumnaTablicy2.length; k++) { // 0 1 2
                    double iloczyn = wierszTablicy1[k] * kolumnaTablicy2[k];
                    sumaIloczynow = sumaIloczynow + iloczyn;
                }


                wynikowa[i][j] = sumaIloczynow;
            }
        }

        System.out.println("-------------------");


        System.out.println("Macierz wynikowa");
        for (int i = 0; i < wynikowa.length; i++) {
            double[] tablicaWewnetrzna = wynikowa[i];
            for (int j = 0; j < tablicaWewnetrzna.length; j++) {
                System.out.print(tablicaWewnetrzna[j] + " ");
            }
            System.out.println();
        }


        // ROZWIĄZANIE ZADANIA KÓŁKO I KRZYŻYK
        // KÓŁKO I KRZYŻYK
        char[][] poleGry = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

        boolean czyRuchKrzyzyk = true;

        while (true) {
            System.out.println("==== RUCH GRACZA " + (czyRuchKrzyzyk ? 'X' : 'O'));

            System.out.println("Podaj wspolrzedna X:");
            int x = new Scanner(System.in).nextInt();

            if (x < 0 || x >= poleGry.length) {
                System.out.println("Podałeś niepoprawną wartość X");
                continue;
            }

            System.out.println("Podaj wspolrzedna Y:");
            int y = new Scanner(System.in).nextInt();

            if (y < 0 || y >= poleGry.length) {
                System.out.println("Podałeś niepoprawną wartość Y");
                continue;
            }


            if (poleGry[x][y] != ' ') {
                System.out.println("ZAJĘTE POLE!!!");
                continue;
            }

            if (czyRuchKrzyzyk) {
                poleGry[x][y] = 'X';
            } else {
                poleGry[x][y] = 'O';
            }

            // NEGACJA
            // !true == false
            // !false == true
            czyRuchKrzyzyk = !czyRuchKrzyzyk;

            // wypisanie pola gry
            for (int i = 0; i < poleGry.length; i++) {
                for (int j = 0; j < poleGry.length; j++) {
                    System.out.print("[" + poleGry[j][i] + "] ");
                }
                System.out.println();
            }
        }
    }
}
