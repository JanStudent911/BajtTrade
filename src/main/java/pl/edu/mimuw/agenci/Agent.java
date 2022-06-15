package pl.edu.mimuw.agenci;


import pl.edu.mimuw.Symulacja;

public abstract class Agent {
    protected int id;
    protected Zasoby zasoby;

    protected transient Symulacja mojaSymulacja;

    public void setMojaSymulacja(Symulacja mojaSymulacja) {
        this.mojaSymulacja = mojaSymulacja;
    }

    public Symulacja getMojaSymulacja() {
        return mojaSymulacja;
    }

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
