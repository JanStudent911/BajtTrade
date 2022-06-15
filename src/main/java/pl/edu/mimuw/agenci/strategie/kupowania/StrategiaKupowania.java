package pl.edu.mimuw.agenci.strategie.kupowania;

public abstract class StrategiaKupowania {
    protected int liczba_narzedzi;

    @Override
    public String toString() {
        return "StrategiaKupowania{" +
                "liczba_narzedzi=" + liczba_narzedzi +
                '}';
    }
}
