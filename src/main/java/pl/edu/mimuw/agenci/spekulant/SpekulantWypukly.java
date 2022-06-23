package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;

import java.util.List;

public class SpekulantWypukly extends StrategiaSpekulanta{


    @Override
    public void build() {
        return;
    }

    public KarieraSpekulanta getKariera() {
        return KarieraSpekulanta.WYPUKLY;
    }

    @Override
    public List<OfertaSpekulanta> budujOferteSprzedazy() {
        return null;
    }

    @Override
    public List<OfertaSpekulanta> budujOferteKupna() {
        return null;
    }
}
