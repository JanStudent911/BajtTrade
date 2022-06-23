package pl.edu.mimuw.agenci.spekulant;

public abstract class StrategiaSpekulanta implements IStrategiaSpekulanta {
    protected transient Spekulant mojSpekulant;
    protected static transient final int ILE_KUPUE_SPEKULANT = 100;
    public abstract KarieraSpekulanta getKariera();
}
