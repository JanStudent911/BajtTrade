package pl.edu.mimuw;

import pl.edu.mimuw.agenci.Agent;
import pl.edu.mimuw.produkty.Produkt;
import pl.edu.mimuw.produkty.Produkty;

public class Oferta {
    protected int ilosc;
    protected Produkty rodzaj_produktu;

    public Oferta(int ilosc, Produkty rodzaj_produktu) {
        this.ilosc = ilosc;
        this.rodzaj_produktu = rodzaj_produktu;

    }
}
