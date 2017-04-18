package pl.jwrabel.notatki;

import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {
        // PĘTLE

        // WHILE jako zapętlony if
//        while(1 < 0){
//            System.out.println("Bla");
//        }

//        while(true){
//            System.out.println("*");
//        }

        double ileRazyMaSieWykonac = (new Scanner(System.in)).nextDouble();

        // pętla - wypisywanie
        int counter = 0;
        while (counter < ileRazyMaSieWykonac) {
            System.out.println("Wartość licznika: " + counter);
            counter++;
        }

        // zwykły while, wypisywanie gwiazdek,  licznik
        // Wypisywanie gwiazdek z print();
        // Wypisywanie znaków - char, porzadek - napierw wartości
        // wczytanie wartości - ile razy ma się wykonać
        // wypisywanie liczb od x do y
        //
        // === ZADANIE === KalkulatorStary na while(true)
        // === ZADANIE === liczenie sumy liczb od x do y


        // break; - pętla while-true
        // === ZADANIE === zgadywanie liczby
        // === ZADANIE === KalkulatorStary na while(true) z wyjściem
        // 1. ZNAK
        // 2. BREAK

        // IF w WHILE - wypisanie tylko parzystych
        // continue; - wypisanie tylko parzystych
        //
        // === ZADANIE === suma liczb od 1 do X - ew dodać do kalkulatora
        // === ZADANIE === wypisanie znaków ASCII od 65 do 90 włącznie!

        // do-while - różnica
        //
        // pokazanie na wypisywaniu gwiazdek

        // for - transformacja z while - wypisanie gwiazdek, jedyne dozwolone użycie i

        // === ZADANIE === wypisywanie na zmianę gwiazdek i kropek
        //

        // zagnieżdżona pętla for
        // wypisanie x1y1 x1y2 x1y3 x2y1 x2y2 x2y3
        // === ZADANIE === choinka
        // === ZADANIE === wypisywanie kwadratu z gwiazdek
        // === ZADANIE === dla zaawansowanych - wypisanie tylko ramki, dodatkowo - ramki trójkąta
        // === ZADANIE === romb
        // === ZADANIE === kalkulator tworzenie nagłówka z hashy - podane x, l - jako odstęp od napisu, w miejsce napisu na początek -

        // === ZADANIE === tabliczna mnożenia, dodawania etc., pokazać tabulator
    }
}
