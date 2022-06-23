package pl.edu.mimuw.agenci.spekulant;


import pl.edu.mimuw.OfertaSpekulanta;

import java.util.List;

public interface IStrategiaSpekulanta {
    public void build();
    public KarieraSpekulanta getKariera();
    public List<OfertaSpekulanta> budujOferteKupna();
    public List<OfertaSpekulanta> budujOferteSprzedazy();
}
