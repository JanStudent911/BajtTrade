package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;

import java.util.Arrays;

public class SpekulantSredni extends StrategiaSpekulanta{
    private int historia_spekulanta_sredniego;

    public KarieraSpekulanta getKariera() {
        return KarieraSpekulanta.SREDNI;
    }

    public SpekulantSredni() {

    }

    public void build(){
        //arrayHistoria = new double[historia_spekulanta_sredniego];
    }

    @Override
    public OfertaSpekulanta budujOferteKupna() {
        return null;
    }

    @Override
    public OfertaSpekulanta budujOferteSprzedazy() {
        return null;
    }
}
