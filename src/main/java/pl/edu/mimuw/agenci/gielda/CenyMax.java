package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.Ceny;
import pl.edu.mimuw.produkty.Produkty;

import java.io.IOException;

public class CenyMax extends CenyDane {
    @Override
    public void aktualizujO(Produkty typ, double cena, int ile) throws IOException {
        switch(typ){
            case JEDZENIE:
                jedzenie = java.lang.Math.max(jedzenie, cena);
                break;
            case UBRANIA:
                ubrania = java.lang.Math.max(jedzenie, cena);
                break;
            case NARZEDZIA:
                narzedzia = java.lang.Math.max(jedzenie, cena);
                break;
            case PROGRAMY:
                programy = java.lang.Math.max(jedzenie, cena);
                break;
            default:
                throw new IOException("zły typ produktu");
        }
    }
}
