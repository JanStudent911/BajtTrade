package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.Ceny;
import pl.edu.mimuw.produkty.Produkty;

import java.io.IOException;

public class CenySrednie extends CenyDane {
    private int ileUbran;
    private int ileNarzedzi;
    private int ileProgramow;
    private int ileJedzenia;

    public CenySrednie() {
        super();
        ileJedzenia = 0;
        ileNarzedzi = 0;
        ileProgramow = 0;
        ileUbran = 0;
    }

    public double nowaSrednia(double stara_cena, int stara_ilosc, double cena, int ile){
        double srednia = stara_ilosc * stara_cena + ile * cena /
                stara_ilosc + ile;
        return srednia;
    }

    @Override
    public void aktualizujO(Produkty typ, double cena, int ile) throws IOException{
        switch (typ){
            case NARZEDZIA:
                narzedzia = nowaSrednia(narzedzia, ileNarzedzi, cena, ile);
                ileNarzedzi += ileNarzedzi;
                break;
            case PROGRAMY:
                programy = nowaSrednia(programy, ileProgramow, cena, ile);
                ileProgramow += ile;
                break;
            case JEDZENIE:
                jedzenie = nowaSrednia(jedzenie, ileJedzenia, cena, ile);
                ileJedzenia += ile;
                break;
            case UBRANIA:
                ubrania = nowaSrednia(ubrania, ileUbran, cena, ile);
                ileUbran += ile;
                break;
            default:
                throw new IOException("zły typ produktu");
        }
    }
}
