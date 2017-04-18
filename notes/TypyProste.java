package pl.jwrabel.notatki;

public class TypyProste {
    public static void main(String[] args) {

        // STWORZENIE/INICJALIZACJA ZMIENNEJ
        int mojaZmienna1;
        // INICJALIZACJA ZMIENNEJ
        int mojaZmienna2 = 2;

        // NAZEWNICTWO ZMIENNYCH
        int zmienna;
//        int zmienna; // błąd, nie mogą istnieć dwie zmienne o takich samych nazwach
        int zmienna1;
        int ZMIENNA; // niezalecane, zmienne z małych liter
        int z_m_i_e_n_n_a; // niezalecane, bez znaków specjalnych
        int xy; //  niezalecane, mało znacząca nazwa
//        int double; // błąd, słowo kluczowe
//        int 1zmienna; // błąd, nie może się rozpoczynać od cyfry
//        int mojaZmienna#; // błąd, nie może mieć znaków specjalnych innych od _
        int ZmiennaKuby; // niezalecane, powinna się rozpoczynać od małej litery
        int mojaBardzoDlugaZmienna; // zalecane, camelCase

        // SPOSOBY TWORZENIA ZMIENNYCH
        int mojaLiczba0;
        int mojaLiczba1 = 0;
        int mojaLiczba2, mojaLiczba3;
        int mojaLiczba4 = 1, mojaLiczba = 2;


        // TYPY PROSTE
        // typy liczbowe
        byte liczbaByte = 5; // 1 bajt (8 bajtów), od -128 do 127
        short liczbaShort = 20; // 2 bajty, od -32 768 do 32 767
        int liczbaCalkowita = 3; // 4 bajty, od -2,147,483,648 do 2,147,483,647
        long liczbaLong = 0L; // 8 bajtów, od -2^63 do (2^63)-1,  przyrostek l lub L

        float liczbaZmiennoprzecinkowa = 0.0023f; // 4 bajty, 6-7 cyfr po przecinku, przyrostek F/f
        double liczbaStaloprzecinkowa = 0.02d; // 8 bajtów, 15 cyfr po przecinku, przyrostek D/d

        System.out.println("liczbaByte: " + liczbaByte);
        System.out.println("liczbaShort: " + liczbaShort);
        System.out.println("liczbaCalkowita: " + liczbaCalkowita);
        System.out.println("liczbaLong: " + liczbaLong);

        System.out.println("liczbaZmiennoprzecinkowa: " + liczbaZmiennoprzecinkowa);
        System.out.println("liczbaStaloprzecinkowa: " + liczbaStaloprzecinkowa);

        // inne sposoby zapisu typów numerycznych
        float float1 = 1e2f; // notacja naukowa = 1*10^2 = 100
        float float2 = 3e-2f; // notacja naukowa = 3*10^-2 = 3 * 1/100 = 3/100 = 0,03
        int duzaLiczba = 1_000_200;

        // najpopularniejsze typy = int, double

        // operatory matematyczne dwuargumentowe + ewaluacja wyrażeń
        int suma = 2 + 4;
        int liczba30 = 30;
        int suma2 = liczba30 + 10; // 40
        int roznica = 6 - 2;
        int iloczyn = 4 * 4;
        double iloraz = 3 / 6;

        int zlyIloraz1 = 2 / 6; // = 0
        int zlyIloraz2 = 5 / 6; // = 0 - nie zaokrągla!

        // przepelnienie
        int duzyInt = 2_000_000_000;
        int przepelniony = duzyInt + duzyInt;
        System.out.println(przepelniony);

        // === ZADANIE ==== kalkulator kursu walut
        double kwotaWZlotowkach = 300;
        double kwotaWEuro = kwotaWZlotowkach * 4.30;
        System.out.println("Kwota w Euro: " + kwotaWZlotowkach);


        // === ZADANIE ==== wzór skróconego mnożenia wynik = a^2 + 2ab + b^2
        double a = 1, b = 2;
        double wynik = a * a + 2 * a * b + b * b;

        // kolejność
        double wynik2 = 2 + 3 * 4; // 14, nie 20

        // nawiasy
        double wynik3 = (2 + 3) * 4; // 20
        double wynik4 = (1 + 1) * (4 - 2); // 4

        // === ZADANIE ==== policz średnią 2 liczb
        // === ZADANIE ==== policz średnią 3 liczb

        // KLASA MATH - Math.
        double wynik5 = Math.abs(-5); // wartość bezwględna, |-5| = 5
        double wynik6 = Math.pow(3, 2); // 3^2 = 3*3 = 9
        double wynik7 = Math.sqrt(9); // pierwiastek, sqrt(9) = 3
        double wynik8 = Math.max(10, 5); // wartość maksymalna = 10
        double wynik9 = Math.min(10, 5); // wartość minimalna = 5
        double stalaMatematyczna = Math.PI; // użycie stałych matematycznych
        // inne funkcje Math. = np. Math.sin(x), Math.cos(x) etc;

        // === ZADANIE ==== wzór skróconego mnożenie wynik=(a+b)^2 z użyciem Math.pow
        // === ZADANIE ==== pole koła
        // === ZADANIE ==== odległość między punktami
        double x1 = 1, y1 = 1, x2 = 3, y2 = 2;
        double odleglosc = Math.sqrt((x2 - x2) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double odleglosc2 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // modulo - reszta z dzielenia
        int reszta = 10 % 4; // = 2

        // === ZADANIE ==== Mam x pieniędzy, y - koszt jednego samochodu. Ile mogę kupić i ile zostanie?
        double x = 100000;
        double y = 1000;
        double ileMogeKupic = x/y;
        double ileWydalem = x*y;
        double ileMiZostalo = x-ileWydalem;
        double ileMiZostaloModulo = x%y;

        int liczba10 = 10;
        System.out.println(liczba10);
        liczba10++; // postinkrementacja
        System.out.println(liczba10);
        ++liczba10; // preinkrementacja
        System.out.println(liczba10);

        liczba10 = 10;
        int liczba11 = ++liczba10;
        System.out.println(liczba11);

        liczba11--; // postdekrementacja
        --liczba11; // predekrementacja

        a++; // a = a + 1 - operator post-inkrementacji
        a--; // a = a - 1 - operator post-dekrementacji
        ++a; // a = a + 1 - operator pre-inkrementacji
        --a; // a = a - 1 - operator pre-dekrementacji

        // operatory "przypisania": -=, +=, \=, %=
        //  === ZADANIE ==== zapisać tak kalkulator walut, z jedną zmieną
        double kwota = 10;
        kwota *= 4.30;


        //  === ZADANIE ==== Policz: (10-5)^2  - 10 / (10%3 + 4)(sqrt(9) + 2^5 - 23)
        //  === ZADANIE ==== Napisz program obliczający 3 bok z twierdzenia pitagorasa: c = sqrt(a^2 + b^2)


        // zmienna char = znak
        char znak = 'X';
        char charAscii = 66; // ASCII code
        char charAscii2 = '\u0065'; // hex - zapis szesnastowy
        // specjalny zapis niektórych znaków
        char charTab = '\t';
        char charLinia = '\n';
        char charPowrot = '\r';
        char charCudzyslow = '\"';
        char charApostrof = '\'';
        char charBackslash = '\\';

        char charDodany = '+' + 'E'; // dodadzą się wartości liczbowe czyli kody ASCII

        // zmienna logiczna
        boolean zmiennaBoolean = false;
        boolean zmiennaBoolean2 = true;

        // operatory porównania
        // <, >, <=, >=, ==, !=
        boolean zmiennaBoolean3 = (2 == 3); // !!! ==  a nie =, porównanie to podwójny znak równości
        boolean zmiennaBoolean4 = 2 == 2; // !!! ==  a nie =, porównanie to podwójny znak równości

        int liczba1 = 10 - 5;
        int liczba2 = 2 * 6 - 1;
        boolean zmiennaBoolean5 = liczba1 == liczba2; // !!! ==  a nie =, porównanie to podwójny znak równości
        boolean zmiennaBoolean6 = (10 - 5) == liczba2; // !!! ==  a nie =, porównanie to podwójny znak równości
        boolean zmiennaBooleanRozne = 3 != 3;


        boolean zmiennaBooleanPrawda = true;
        boolean zmiennaBooleanFalsz = !true; // false negacja, !(true) = false, !(false) = true
        boolean zmiennaBooleanFalsz2 = !zmiennaBooleanPrawda;

        // koniunkcja (AND, "coś i coś") - &&
        boolean zmiennaBooleanKoniunkcja1 = true && true; // true = true AND true = true^true
        boolean zmiennaBooleanKoniunkcja2 = true && false; // false
        boolean zmiennaBooleanKoniunkcja3 = false && true; // false
        boolean zmiennaBooleanKoniunkcja4 = false && false; // false

        // alternatywa (OR, "coś lub coś") - ||
        boolean zmiennaBooleanAlternatywa1 = true || true; // true = true OR true = true v true
        boolean zmiennaBooleanAlternatywa2 = false || true; // true
        boolean zmiennaBooleanAlternatywa3 = true || false; // true
        boolean zmiennaBooleanAlternatywa4 = false || false; // false

        // === ZADANIE ==== Zapisz do zmiennej wartość !(true AND true) OR (true AND !true)
        // === ZADANIE ==== Czy 2^100 > 100^2 lub sqrt(8) > 1.2


        // Wypisanie char i boolean
        System.out.println("znak: " + znak);
        System.out.println("zmiennaBoolean: " + zmiennaBoolean);


        // === ZADANIE ==== Policz objętość kuli opisanej na stożku, wypisz wszystkie zmienne (wejściowe, wyjściowe)
        // https://pl.wikipedia.org/wiki/Sto%C5%BCek_(bry%C5%82a)
        // Wprowadż kolejną zmienną i zwróc wartość boolean = 'czy podana liczba jest większa od obliczonej objętości kuli'
    }
}
