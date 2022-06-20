package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.produkty.Produkty;

public abstract class CenyDane implements ICenyDane {

    protected double programy;
    protected double jedzenie;
    protected double ubrania;
    protected double narzedzia;

    public CenyDane(){
        programy = 0;
        jedzenie = 0;
        ubrania = 0;
        narzedzia = 0;
    }


}
