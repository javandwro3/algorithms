        package pl.jwrabel.notatki.obiektowosc;

        /**
         * Created by jakubwrabel on 10.12.2016.
         */
        public class NOTATKIObiektowosc {
            public static void main(String[] args) {
                // KLASA - szablon, wzorzec
                // OBIEKT - instancja klasy
                // POLA - "zmienne" klasy, odpowiadają za stan
                // METODY - odpowiadają za zachowanie

                // KLASY powstały po to, aby odwzorować w programie rzeczywisty świat, "zamodelować" go
                // kolejną zaletą klas jest jasny podział programu na częsći
                // odpowiedzialne za poszczególne funkcjonalności

                // Najprostsza definicja klasy (plik MojaKlasa.java)
                // public class MojaKlasa {
                //
                // }

                // Użycie klasy - utworzenie obiektu
                MojaKlasa mojaKlasa1 = new MojaKlasa(); // mojaKlasa1 to obiekt! klasy
                // konstrukcja new Klasa() powoduje stworzenie
                // nowego obiektu danej klasy

                // Klasa z polami i metodami - patrz plik MojaDrugaKlasa.java

                // POLA
                MojaDrugaKlasa mojaDrugaKlasa = new MojaDrugaKlasa();
                int x = mojaDrugaKlasa.x;
                int y = mojaDrugaKlasa.y;

                System.out.println("Przeczytane dane z obiektu klasy MojaDrugaKlasa: ");
                System.out.println("x: " + x);
                System.out.println("y: " + y);
                // Nie trzeba używać pomocniczych zmiennych jak x i y, można zapisać to następująco:
                System.out.println("x: " + mojaDrugaKlasa.x);
                System.out.println("y: " + mojaDrugaKlasa.y);
                // Program wypisze x = 0 i y = 0 ponieważ nigdy nie przypisaliśmy im wartości
                // a typy proste numeryczne jako pola mają domyślną wartość 0


                // METODY
                mojaDrugaKlasa.odezwijSie();  // Wypisz "CZESC!!!!"
                // kod zawarty w metodach jest wywoływany tylko gdy jej użyjemy tj. wywołamy
                // na obiekcie klasy!


                // Sygnatura metody
                // [modyfikator_dostępu(opcjonalny)] [inne_modyfikatory(opcjonalne)] [typ_zwracany] [nazwametody] ( [parametry_oddzielone_przecinkami] ) {
                //      // CIAŁO METODY
                // }
                // Metody możemy traktować jak wywołanie podprogramu, który "coś" dla nas zrobi
                // taki podprogram może dostać jakieś parametry (ale nie musi - wtedy nawiasy za nazwą metody będą puste)
                // oraz może zwrócić nam jakąś wartość, jeśli nie zwraca w miejsce [zwracany_typ] należy wstawić słowo "void",
                // jeśli zwraca na koniec ciała metody musi zostać wykonana instrukcja return <wartość>;

                // Przykładowe metody -> Plik/klasa Metody.java
                // Użycie metod

                Metody metody = new Metody();

                metody.wypiszCzesc();

                metody.wypiszLiczbe(x);

                double zwroconaDwukrotnosc = metody.dajDwukrotnosc(10);
                System.out.println("Zwrocona dwukrotnosc: " + zwroconaDwukrotnosc);

                double zwroconaSuma = metody.dodajDwieLiczby(10, 20);
                System.out.println("Zwrocona suma: " + zwroconaSuma);


                // KONSTRUKTORY
                // konstruktor może rozumieć, jako specjalną metodę, która tworzy obiekt
                // w momencie tworzenia obiektu np przez new Metody() tak naprawdę wywoływany jest
                // konstruktor domyślny-bezparametrowy tworzony automatycznie przez Javę. W momencie,
                // gdy napiszemy sami jakikolwiek konstruktor, konstruktor domyślny nie zostanie
                // automatycznie wygenerowany!!
                // Konstruktory służą do inicjalizowania obiektu, przypisania mu wartości już w momencie tworzenia

                // Przykładowe konstruktory -> Plik/klasa Konstruktory.java
                // Użycia:

                Konstruktory konstruktory1 = new Konstruktory();
                Konstruktory konstruktory2 = new Konstruktory(100);
                Konstruktory konstruktory3 = new Konstruktory(200, 300);

                // MODYFIKATORY DOSTĘPU
                // w Javie istnieją 4 modyfikatory dostępu, każdy z nich możemy stosować zarówno
                // przed polami jak i konstruktorami i metodami

                // 1. DEFAULT(brak modyfikatora) - dostęp pakietowy (domyślny),
                //          daje dostęp do metody/pola/konstruktora
                //          wszystkim wewnątrz tego samego pakietu
                // 2. public - dostęp publiczny, daje dostęp wszystkim niezależnie od położenia
                // 3. private - dostęp tylko i wyłacznie z wewnątrz tej samej klasy
        //                  np. pole private int x; można odczytać i modyfikować tylko w metodzie tej samej klasy
                // 4.  protected - zachowuje się podobnie do private tylko w przypadku dziedziczenia daje dostęp
        //                  wszystkim dzieciom

                // zastosowanie modyfikatorów dostepu -> klasa\plik Modyfikatory.java

                // modyfikatory w praktyce
                Modyfikatory modyfikatory = new Modyfikatory();

                // mamy dostęp do wszystkich elementów publicznych
                modyfikatory.metodaPubliczna();
                modyfikatory.polePubliczne = 100;

                // mamy dostęp do wszystkich elementów pakietowych ponieważ jesteśmy w tym samym pakiecie
                modyfikatory.metodaPakietowa();
                modyfikatory.polePakietowe = 100;

                // nie mamy dostępu do elementów prywatnych
        //        modyfikatory.metodaPrywatna();
        //        modyfikatory.polePrywatne = 100;

                // GETTERY I SETTERY
                // Bardzo dobrą i wręcz wymaganą praktyką jest deklarowanie wszystkich pól jako prywatne
                // oraz tworzenie tzw. getterów i setterów - metod do odczytywania i ustawiania zawartości
                // tych pól (ponieważ metody danej klasy mają dostęp do jej metod i pól prywatnych)
                // Gettery -> metoda o nazwie get<Nazwa_pola>() { return pole; }
                // Settery -> metoda o nazwie set<Nazwa_Pola>(<typ> <nazwaPola>){ this.<nazwa_pola> = <nazwa_pola>; }
                // Wyjątkiem są pola typu boolean, w tym wypadku zamiast np. getPole getter powienien mieć nazwę isPole

                // Przykładowe gettery i settery -> klasa\plik "GetterySettery.java"


                // MODYFIKATOR FINAL
                // pole oznaczone jako final może mieć tylko raz przypisaną wartość i musi to być zrobione
                // przy jego tworzeniu lub w konstruktorze (każdym istniejącym!)
                // pola final powinny być nazywane dużymi literami, słowa oddzielone znakiem _
                // np. final int MOJE_POLE_FINAL = 100;
                // najczęściej używa się tego modyfikatora razem z modyfikatorem static

                // MODYFIKATOR STATIC (statyczne)
                // modyfikatora static możemy użyć dla pól oraz metod, wtedy takie pole/metoda istnieje "dla klasy" a nie dla obiektu
                // w związku z tym wszystkie obiekty klasy mają TO SAMO pole statyczne
                // Metody i pola statyczne nie wymagają tworzenia obiektu! Można się do nich dostać
                // bezpośrednio przez nazwę klasy

                // metody statyczne jakich już używaliśmy (nie musimy tworzyć obiektu, odnosimy się przez nazwę klasy)
                Math.abs(10);
                Math.pow(10, 10);

                // static i final przykłady -> pole/klasa StaticFinal.java
                int wartoscPolaStatic = StaticFinal.POLE_STATYCZNE_1;
                StaticFinal.metodaStatycznaCzesc();

                int wartoscStalej = StaticFinal.MOJA_STALA; // pola static final nazywamy stałymi
                                    // (wspólna, niezmienna wartość dla wszystkich obiektów klasy)


            }


        }
