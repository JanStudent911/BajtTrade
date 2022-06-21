package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;

public class SpekulantWypukly extends StrategiaSpekulanta{


    @Override
    public void build() {
        return;
    }

    public KarieraSpekulanta getKariera() {
        return KarieraSpekulanta.WYPUKLY;
    }

    @Override
    public OfertaSpekulanta budujOferteSprzedazy() {
        return null;
    }

    @Override
    public OfertaSpekulanta budujOferteKupna() {
        return null;
    }
}
