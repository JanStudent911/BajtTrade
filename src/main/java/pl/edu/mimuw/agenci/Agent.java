package pl.edu.mimuw.agenci;


import pl.edu.mimuw.agenci.strategie.Readers.ZasobyReader;

public abstract class Agent {
    protected int id;
    protected Zasoby zasoby;

    public int getId() {
        return id;
    }

    public Zasoby getZasoby() {
        return zasoby;
    }

    public Agent(int id, Zasoby zasoby){
        this.id = id;
        this.zasoby = zasoby;
    }
}
