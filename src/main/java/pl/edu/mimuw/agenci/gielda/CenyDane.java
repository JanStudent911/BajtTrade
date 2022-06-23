package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.produkty.Produkty;

public abstract class CenyDane implements ICenyDane {

    protected double programy;
    protected double jedzenie;
    protected double ubrania;
    protected double narzedzia;

    public double getCenaProduktu(Produkty p){
        double odp;
        switch (p){

            case JEDZENIE:
                odp = jedzenie;
                break;
            case UBRANIA:
                odp = ubrania;
                break;
            case NARZEDZIA:
                odp = narzedzia;
                break;
            case PROGRAMY:
                odp = programy;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + p);
        }
        return odp;
    }

    public CenyDane(){
        programy = 0;
        jedzenie = 0;
        ubrania = 0;
        narzedzia = 0;
    }


}
