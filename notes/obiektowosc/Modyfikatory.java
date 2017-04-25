package pl.jwrabel.notatki.obiektowosc;

/**
 * Created by jakubwrabel on 10.12.2016.
 */
public class Modyfikatory {
    private int polePrywatne;
    int polePakietowe;
    public int polePubliczne;

    private void metodaPrywatna(){

    }

    void metodaPakietowa(){
        // z poziomu metody z tej samej klasy mamy dostęp do wszystkich elementów prywatnych
        metodaPrywatna();
        polePrywatne = 10;
    }

    public void metodaPubliczna(){

    }
}
