package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;

import java.util.List;

public class SpekulantRegulujacy extends StrategiaSpekulanta{

    @Override
    public List<OfertaSpekulanta> budujOferteSprzedazy() {
        return null;
    }

    @Override
    public void build() {
        return;
    }

    public KarieraSpekulanta getKariera() {
        return KarieraSpekulanta.REGULUJACY;
    }

    @Override
    public List<OfertaSpekulanta> budujOferteKupna() {
        return null;
    }
}
