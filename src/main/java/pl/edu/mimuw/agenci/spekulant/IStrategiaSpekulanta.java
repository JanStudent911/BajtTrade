package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;

public interface IStrategiaSpekulanta {
    public void build();
    public KarieraSpekulanta getKariera();
    public Oferta budujOferteKupna();
}
