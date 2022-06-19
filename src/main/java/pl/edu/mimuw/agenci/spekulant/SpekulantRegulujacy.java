package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;

public class SpekulantRegulujacy extends StrategiaSpekulanta{

    @Override
    public void build() {
        return;
    }

    public KarieraSpekulanta getKariera() {
        return KarieraSpekulanta.REGULUJACY;
    }

    @Override
    public Oferta budujOferteKupna() {
        return null;
    }
}
