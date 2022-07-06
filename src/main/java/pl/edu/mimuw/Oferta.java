package pl.edu.mimuw;

import pl.edu.mimuw.agenci.Agent;
import pl.edu.mimuw.produkty.Produkt;
import pl.edu.mimuw.produkty.Produkty;

import java.util.List;

public class Oferta {
    protected int ilosc;
    protected List<Produkt> obiekty;
    protected Produkty rodzaj_produktu;
    protected Agent mojAgent;

    public Oferta(int ilosc, Produkty rodzaj_produktu, Agent mojAgent) {
        this.ilosc = ilosc;
        this.rodzaj_produktu = rodzaj_produktu;
        this.mojAgent = mojAgent;
    }

    public int getIlosc() {
        return ilosc;
    }

    public Produkty getRodzaj_produktu() {
        return rodzaj_produktu;
    }

    public Agent getMojAgent() {
        return mojAgent;
    }

    public void zabierzSztuki(int x){
        ilosc -= x;
    }
}
