package pl.edu.mimuw.agenci.strategie.kupowania;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.produkty.Produkty;

public class Technofob extends StrategiaKupowania{
    private final static int ILOSC_JEDZENIA_TECHNOFOBA = 100;


    @Override
    public Oferta budujOfertęKupna() {
        return new Oferta(ILOSC_JEDZENIA_TECHNOFOBA, Produkty.JEDZENIE, mojRobotnik);
    }
}
