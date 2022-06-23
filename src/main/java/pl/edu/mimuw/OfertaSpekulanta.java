package pl.edu.mimuw;

import pl.edu.mimuw.agenci.Agent;
import pl.edu.mimuw.produkty.Produkty;

public class OfertaSpekulanta extends Oferta{
    private double cena;
    public OfertaSpekulanta(int ilosc, Produkty rodzaj_produktu, double cena) {
        super(ilosc, rodzaj_produktu);
        this.cena = cena;
    }
}
