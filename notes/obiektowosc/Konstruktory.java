package pl.jwrabel.notatki.obiektowosc;

/**
 * Created by jakubwrabel on 10.12.2016.
 */
public class Konstruktory {
    int x;
    int y;

    // ręcznie napisany konstruktor domyślny
    public Konstruktory(){
        x = 10;
        y = 10;
    }

    public Konstruktory(int x) {
        this();
        // this to wskaźnik na tą samą klasę (Konstruktory), this() to to samo
        // co Konstruktory() czyli wywołanie konstruktora domyślnego (tego powyżej)
        // dzięki temu mam najpier ustawione wartości domyślne a potem...

        // przypisujemy do pola x klasy Konstruktory (this.x) wartość przekazaną w parametrze x
        this.x = x;
    }

    public Konstruktory(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
