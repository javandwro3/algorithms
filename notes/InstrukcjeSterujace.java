package pl.jwrabel.notatki;

import java.util.Scanner;

public class InstrukcjeSterujace {
    public static void main(String[] args) {
        // WCZYTYWANIE LICZBY OD UŻYTKOWNIKA
        System.out.println("Podaj pierwsza liczbe: ");
        double przeczytanaLiczba = (new Scanner(System.in)).nextDouble();
        System.out.println("Przeczytana liczba: " + przeczytanaLiczba);

        // dla int-a
        int przeczytanyInt = new Scanner(System.in).nextInt();
        System.out.println("Przeczytana liczba całkowita int: " + przeczytanaLiczba);

        // === ZADANIE === Napisz program, który policzy długość odcinka c korzystając z Twierdzenia Pitagorasa
        // tzn. c = sqrt(a^2 + b^2). Użyj Scannera do wczytania a i b od użytkownika
        System.out.println("Podaj długość odcinka a: ");
        double a = (new Scanner(System.in)).nextDouble();
        System.out.println("Podaj długość odcinka b: ");
        double b = (new Scanner(System.in)).nextDouble();

        double wynik = Math.sqrt(a * a + b * b);
        System.out.println("Długość odcinka c: " + wynik);

        // INSTRUKCJE STERUJĄCE
        // przypomnienie operatorów porównania: ==, !=, <, >, >=, <=
        // instrukcja sterująca (wyrażenie warunkowe) IF:
        if ( /*<warunek, np.:*/ 2 > 2) {
            // Tutaj umieszczamy kod, który zostanie wykonany gdy warunek jest spełniony tzn. jego wartość to true
        } else {
            // Tutaj umieszczamy kod, który zostanie wykonany gdy warunek NIE jest spełniony tzn. jego wartość to false
        }


        int liczba100 = 100;
        int liczba101 = 200;
        if (liczba100 % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        }

        if (liczba100 % 2 == 0 || liczba101 % 2 == 0) {
            System.out.println("Przynajmniej jedna z tych liczb jest parzysta");
        }


        int liczba = 10;
        System.out.println("Przed (ZAWSZE)");
        if (liczba > 0) {
            System.out.println("Liczba jest dodatnia (TYLKO GDY WARUNEK JEST SPEŁNIONY)");
        }
        System.out.println("Po (ZAWSZE)");


        System.out.println("Podaj liczbe do porownania: ");
        double liczbaDoPorownania = (new Scanner(System.in)).nextDouble();
        if (liczbaDoPorownania > 10) {
            System.out.println("Liczba jest większa od 10");
        } else {
            System.out.println("Liczba NIE jest większa od 10");
        }
        System.out.println("Ten napis zostanie wypisany zawsze na koniec");

        // === ZADANIE === Napisz program wczytujący liczbę oraz zwracający jej wartość bezwględną
        double liczbaDoPoliczeniaWartosciBezwzglednej = (new Scanner(System.in)).nextDouble();
        double wynik2 = 0;
        if (liczbaDoPoliczeniaWartosciBezwzglednej >= 0) {
            wynik2 = liczbaDoPoliczeniaWartosciBezwzglednej;
        } else {
            wynik2 = -liczbaDoPoliczeniaWartosciBezwzglednej;
        }
        System.out.println("Wartość bezwzględna wynosi: " + wynik);
        // inny sposób rozwiązania tego zadania
        double liczbaDoPoliczeniaWartosciBezwzglednej2 = (new Scanner(System.in)).nextDouble();
        if (liczbaDoPoliczeniaWartosciBezwzglednej2 >= 0) {
            System.out.println("Wartość bezwzględna wynosi: " + liczbaDoPoliczeniaWartosciBezwzglednej2);
        } else {
            System.out.println("Wartość bezwzględna wynosi: " + (-liczbaDoPoliczeniaWartosciBezwzglednej2));
            // gdy chcemy w System.out... wykonać działanie dobrą praktyką jest "ubranie" go w nawiasy
        }


        // zagnieżdżony if
        if (liczba > 10) {
            if (liczba >= 100) {
                System.out.println("Liczba jest większa lub równa 100");
            } else {
                System.out.println("Liczba jest większa od 10 i mniejsza od 100");
            }
        } else {
            System.out.println("Liczba jest mniejsza lub równa 10");
        }

        // === ZADANIE === Trójkąt pitagorasa, policzenie c + sprawdzenie, czy którakolwiek z podanych liczb jest ujemna
        // === ZADANIE === Trójkąt pitagorasa - sprawdzenie, która liczba jest ujemna


        // if-else
        if (liczba > 10) {
            // Wykona się, gdy warunek spełniony (liczba>10)
        } else if (liczba > 5) {
            // Wykona się, gdy pierwszy warunek nie był spełniony a drugi jest(liczba>5)
        } else {
            // Wykona się, gdy ani pierwszy ani drugi warunek nie został spełniony
        }
        // taka konstrukcja jak powyżej działa tak, że "idzie od góry" aż nie napotka na spełniony warunek,
        // jeśli znajdzie to wykonuje tylko kod dla tego warunku, jeśli nie to wykonuje ostatniego elsa'a

        // === ZADANIE === Napisz kalkulator: wczyta dwie liczby (x i y) + liczbę odpowiadającą za wybór działania
        // np. (1-dodawanie, 2-odejmowanie, 3-dzielenie, 4-mnożenie, 5-modulo)
        // i w zależności od wybranego działania zwróci wynik
        // Pamiętaj o obsłudze sytuacji, gdy użytkownik poda niepoprany "kod" działania

        // === ZADANIE === Wczytaj 3 liczby, wypisz, która jest najmniejsza, która jest pośrodku i która jest największa
        System.out.println("Podaj liczbę x: ");
        double x = (new Scanner(System.in)).nextDouble();
        System.out.println("Podaj liczbę y: ");
        double y = (new Scanner(System.in)).nextDouble();
        System.out.println("Jakie chcesz wykonać działanie? (1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie, 5-reszta z dzielenia):");
        int dzialanie = (new Scanner(System.in)).nextInt();

        // rozwiazanie 1
        double wynikDzialania = 0;
        if (dzialanie == 1) {
            wynikDzialania = x + y;
        } else if (dzialanie == 2) {
            wynikDzialania = x - y;
        } else if (dzialanie == 3) {
            wynikDzialania = x * y;
        } else if (dzialanie == 4) {
            wynikDzialania = x / y;
        } else if (dzialanie == 5) {
            wynikDzialania = x % y;
        } else {
            System.out.println("Podałeś niepoprawny kod działania!");
        }
        System.out.println("Wynik: " + wynikDzialania);

        // rozwiazanie 2
        boolean czyPoprawnyKodDzialana = dzialanie > 0 && dzialanie <= 5;
        if (czyPoprawnyKodDzialana) {
            double wynikDzialania2 = 0;
            if (dzialanie == 1) {
                wynikDzialania2 = x + y;
            } else if (dzialanie == 2) {
                wynikDzialania2 = x - y;
            } else if (dzialanie == 3) {
                wynikDzialania2 = x * y;
            } else if (dzialanie == 4) {
                wynikDzialania2 = x / y;
            } else if (dzialanie == 5) {
                wynikDzialania2 = x % y;
            }
            System.out.println("Wynik: " + wynikDzialania2);
        } else {
            System.out.println("Podałeś niepoprawny kod działania!");
        }

        // rozwiazanie 3
        if (dzialanie == 1) {
            System.out.println("Wynik sumy " + x + " + " + y + " = " + (x + y));
        } else if (dzialanie == 2) {
            System.out.println("Wynik różnicy " + x + " - " + y + " = " + (x - y));
        } else if (dzialanie == 3) {
            System.out.println("Wynik iloczynu " + x + " * " + y + " = " + (x * y));
        } else if (dzialanie == 4) {
            System.out.println("Wynik ilorazu " + x + " / " + y + " = " + (x / y));
        } else if (dzialanie == 5) {
            System.out.println("Wynik reszty z dzielenia " + x + " % " + y + " = " + (x % y));
        } else {
            System.out.println("Podałeś niepoprawny kod działania!");
        }

        // PRZENIEść kalkulator do innej klasy
        // wypisanie kilku zmiennych w sout
        //
        // zakres zmiennych w IF
        //
        // operator trójargumentowy
        //
        // === ZADANIE === Policzenie miejsc zerowych funkcji matematycznej
        // http://www.matematykam.pl/miejsca_zerowe_funkcji_kwadratowej.html
        //

        // SWITCH
        // switch, rozpisać i rozrysować, czemu jest break
        int x2 = 1;
        switch (x2) {
            case 0:
                System.out.println("Wybrano 1");
                break;
            case 1:
                System.out.println("Wybrano 2");
                break;
            default:
                System.out.println("Nie wybrano 1 ani 2");
        }
        // przerobić kalulator na case, na 5 różnych działań
    }
}
