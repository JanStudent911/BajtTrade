package pl.edu.mimuw.gielda;

import pl.edu.mimuw.produkty.Produkty;

public class CenyMin extends CenyDane {
    public CenyMin() {
        super();
        jedzenie = Double.MAX_VALUE;
        ubrania = Double.MAX_VALUE;
        narzedzia = Double.MAX_VALUE;
        programy = Double.MAX_VALUE;

    }

    @Override
    public void aktualizujO(Produkty typ, double cena, int ile) {
        switch(typ){
            case JEDZENIE:
                jedzenie = Math.min(jedzenie, cena);
                break;
            case UBRANIA:
                ubrania = Math.min(jedzenie, cena);
                break;
            case NARZEDZIA:
                narzedzia = Math.min(jedzenie, cena);
                break;
            case PROGRAMY:
                programy = Math.min(jedzenie, cena);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typ);
        }
    }
}
