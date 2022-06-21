package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;
import pl.edu.mimuw.agenci.Agent;
import pl.edu.mimuw.agenci.Zasoby;

public class Spekulant extends Agent {
    private transient StrategiaSpekulanta mojaStrategiaSpekulanta;

    public Spekulant(int id, Zasoby zasoby, StrategiaSpekulanta strategiaSpekulanta){
        super(id, zasoby);
        this.mojaStrategiaSpekulanta = strategiaSpekulanta;
//        this.kariera = kariera;
    }

    public KarieraSpekulanta getKariera() {
        return mojaStrategiaSpekulanta.getKariera();
    }


    public OfertaSpekulanta budujOferteKupna(){
        return mojaStrategiaSpekulanta.budujOferteKupna();
    }

    public OfertaSpekulanta budujOferteSprzedazy(){
        return mojaStrategiaSpekulanta.budujOferteSprzedazy();
    }
}

