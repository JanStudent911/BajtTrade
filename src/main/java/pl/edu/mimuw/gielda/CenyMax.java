package pl.edu.mimuw.gielda;

import pl.edu.mimuw.produkty.Produkty;

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
