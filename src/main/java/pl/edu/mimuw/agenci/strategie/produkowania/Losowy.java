package pl.edu.mimuw.agenci.strategie.produkowania;

import pl.edu.mimuw.produkty.Produkty;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Losowy extends StrategiaProdukowania{
    private List<Produkty> produktyList;

    public Losowy() {
        produktyList = Collections.unmodifiableList(Arrays.asList(produkty));
    }

    @Override
    public Produkty wybierzProdukt() {
       int size = produktyList.size();
       return produktyList.get(mojaSymulacja.random.nextInt(size));
    }
}
