package pl.edu.mimuw.agenci.strategie.produkowania;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.produkty.Produkty;

import java.io.IOException;

public interface IStrategiaProdukowania {
    public Produkty wybierzProdukt();
    public Oferta produkujOferte() throws IOException;

}
