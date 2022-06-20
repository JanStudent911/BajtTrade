package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.produkty.Produkty;
import java.io.IOException;

public class CenyMin extends CenyDane {
    @Override
    public void aktualizujO(Produkty typ, double cena, int ile) throws IOException {
        switch(typ){
            case JEDZENIE:
                jedzenie = java.lang.Math.min(jedzenie, cena);
                break;
            case UBRANIA:
                ubrania = java.lang.Math.min(jedzenie, cena);
                break;
            case NARZEDZIA:
                narzedzia = java.lang.Math.min(jedzenie, cena);
                break;
            case PROGRAMY:
                programy = java.lang.Math.min(jedzenie, cena);
                break;
            default:
                throw new IOException("zły typ produktu");
        }
    }
}
