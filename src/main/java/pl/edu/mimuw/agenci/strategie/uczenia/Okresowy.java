package pl.edu.mimuw.agenci.strategie.uczenia;

import pl.edu.mimuw.Symulacja;

public class Okresowy extends StrategiaUczenia{
    private int okresowosc_nauki;
    @Override
    public boolean pracujDecyzja() {
        return mojaSymulacja.info.getDzien() % okresowosc_nauki == 0;
    }
}
