package pl.jwrabel.notatki.obiektowosc;

/**
 * Created by jakubwrabel on 10.12.2016.
 */
public class GetterySettery {
    private int x;
    private double liczba;
    private boolean white;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getLiczba() {
        return liczba;
    }

    public void setLiczba(double liczba) {
        this.liczba = liczba;
    }

    // wyjątek - getter dla pola boolean zaczyna się od  "is"
    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }
}
