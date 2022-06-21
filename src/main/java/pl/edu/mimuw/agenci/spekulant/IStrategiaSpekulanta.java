package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;

public interface IStrategiaSpekulanta {
    public void build();
    public KarieraSpekulanta getKariera();
    public OfertaSpekulanta budujOferteKupna();
    public OfertaSpekulanta budujOferteSprzedazy();
}
