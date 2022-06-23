package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.produkty.Produkty;

import java.io.IOException;

public class HistoriaCenDnia {
    private int dzien;

    public HistoriaCenDnia(int dzien) {
        this.dzien = dzien;
        max = new CenyMax();
        sr = new CenySrednie();
        min = new CenyMin();
    }

    private CenyMax max;
    private CenySrednie sr;
    private CenyMin min;

    public CenyMax getMax() {
        return max;
    }

    public CenySrednie getSr() {
        return sr;
    }

    public CenyMin getMin() {
        return min;
    }

    public void notuj(Produkty produkt, double cena, int ile) {
        max.aktualizujO(produkt, cena, ile);
        sr.aktualizujO(produkt, cena, ile);
        min.aktualizujO(produkt, cena, ile);
    }
}
