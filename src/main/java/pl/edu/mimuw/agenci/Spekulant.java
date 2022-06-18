package pl.edu.mimuw.agenci;

public class Spekulant extends Agent implements ISpekulant{
    private StrategiaSpekulanta mojaStrategiaSpekulanta;

    public Spekulant(int id, Zasoby zasoby, StrategiaSpekulanta strategiaSpekulanta){
        super(id, zasoby);
        this.mojaStrategiaSpekulanta = strategiaSpekulanta;
//        this.kariera = kariera;
    }

    @Override
    public KarieraSpekulanta getKariera() {
        return mojaStrategiaSpekulanta.getKariera();
    }
}

