package pl.edu.mimuw.agenci.strategie.produkowania;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.Strategia;
import pl.edu.mimuw.produkty.Produkty;

import java.io.IOException;

public abstract class StrategiaProdukowania extends Strategia implements IStrategiaProdukowania {
    protected Produkty produkty;


    public Oferta produkujOferte() throws IOException {
        Produkty produkt = mojRobotnik.getProdukcja().wybierzProdukt();
        Oferta oferta = new Oferta(mojRobotnik.getProduktywnosc().getIlosc(produkt), produkt);
        return oferta;
    }
}
