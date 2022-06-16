package pl.edu.mimuw.agenci.strategie.zmiany;

import pl.edu.mimuw.agenci.KarieraRobotnika;
import pl.edu.mimuw.agenci.strategie.Adapters.Zmiana;

public interface IStrategiaZmianyKariery {

    public Zmiana getNazwa();
    public KarieraRobotnika zmienKariere();//if null - nie zmienia;
}
