package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.Ceny;
import pl.edu.mimuw.produkty.Produkty;

import java.io.IOException;

public class CenyMax extends CenyDane {

    public CenyMax() {
        super();
        jedzenie = 0;
        ubrania = 0;
        narzedzia = 0;
        programy = 0;

    }

    @Override
    public void aktualizujO(Produkty typ, double cena, int ile) {
        switch(typ){
            case JEDZENIE:
                jedzenie = Math.max(jedzenie, cena);
                break;
            case UBRANIA:
                ubrania = Math.max(ubrania, cena);
                break;
            case NARZEDZIA:
                narzedzia = Math.max(narzedzia, cena);
                break;
            case PROGRAMY:
                programy = Math.max(programy, cena);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typ);
        }
    }
}
