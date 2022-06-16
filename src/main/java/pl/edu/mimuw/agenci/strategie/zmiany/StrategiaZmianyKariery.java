package pl.edu.mimuw.agenci.strategie.zmiany;

import pl.edu.mimuw.agenci.strategie.Adapters.Zmiana;

public abstract class StrategiaZmianyKariery implements IStrategiaZmianyKariery{
    protected Zmiana nazwa;

    public Zmiana getNazwa() {
        return nazwa;
    }
}
