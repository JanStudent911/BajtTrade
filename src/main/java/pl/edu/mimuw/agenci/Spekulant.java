package pl.edu.mimuw.agenci;

public class Spekulant extends Agent {
    private String kariera;

    public String getKariera() {
        return kariera;
    }

    public Spekulant(int id, Zasoby zasoby, String kariera){
        super(id, zasoby);
        this.kariera = kariera;
    }
}
