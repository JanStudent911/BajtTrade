package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;

public class SpekulantWypukly extends StrategiaSpekulanta{


    @Override
    public void build() {
        return;
    }

    public KarieraSpekulanta getKariera() {
        return KarieraSpekulanta.WYPUKLY;
    }

    @Override
    public Oferta budujOferteKupna() {
        return null;
    }
}
