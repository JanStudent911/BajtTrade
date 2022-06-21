package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.produkty.Produkty;
import java.io.IOException;

public interface ICenyDane {
    public void aktualizujO(Produkty typ, double cena, int ile) throws IOException;
}
