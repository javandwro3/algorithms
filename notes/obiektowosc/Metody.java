package pl.jwrabel.notatki.obiektowosc;

/**
 * Created by jakubwrabel on 10.12.2016.
 */
public class Metody {
    // metoda nie przyjmująca żadnych parametrów, wypisuje napis "CZESC",
    // nic nie zwraca (słowo void)
    void wypiszCzesc() {
        System.out.println("CZESC");
    }

    // metoda przyjmująca liczbę (parametr double) oraz ją wypisująca
    void wypiszLiczbe(double x) {
        System.out.println("Podana liczba: " + x);
    }

    // metoda przyjmująca liczbę (parametr double), wypisująca ją oraz zwracająca jej dwukrotność (zwraca double)
    double dajDwukrotnosc(double x) {
        System.out.println("Podana liczba: " + x);
        return x * 2;
    }

    // metoda przyjmująca 2 liczby(2 parametry typu double), wypisująca ją oraz zwracająca ich sumę (zwraca double)
    double dodajDwieLiczby(double x, double y) {
        return (x + y);
    }
}
