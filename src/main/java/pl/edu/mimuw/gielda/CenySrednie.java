package pl.edu.mimuw.gielda;

import pl.edu.mimuw.produkty.Produkty;

import static java.lang.Math.max;

public class CenySrednie extends CenyDane {
    private int ileUbran;
    private int ileNarzedzi;
    private int ileProgramow;
    private int ileJedzenia;

    public CenySrednie() {
        super();
        ileJedzenia = 0;//todo chyba delikatny scam - wliczamy ceny 0 do sredniej?
        ileNarzedzi = 0;
        ileProgramow = 0;
        ileUbran = 0;
    }

    public double nowaSrednia(double stara_cena, int stara_ilosc, double cena, int ile){
        double srednia = stara_ilosc * stara_cena + ile * cena /
                max(stara_ilosc + ile, 1);//dla startowej ceny ten max
        return srednia;
    }

    @Override
    public void aktualizujO(Produkty typ, double cena, int ile){
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
                throw new IllegalStateException("Unexpected value: " + typ);
        }
    }
}
