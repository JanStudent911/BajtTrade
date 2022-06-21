package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;

public class SpekulantRegulujacy extends StrategiaSpekulanta{

    @Override
    public OfertaSpekulanta budujOferteSprzedazy() {
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
    public OfertaSpekulanta budujOferteKupna() {
        return null;
    }
}
