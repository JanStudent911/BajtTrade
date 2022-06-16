package pl.edu.mimuw.agenci.strategie.zmiany;

import org.jetbrains.annotations.Nullable;
import pl.edu.mimuw.agenci.KarieraRobotnika;
import pl.edu.mimuw.agenci.strategie.Adapters.Zmiana;

public class Rewolucjonista extends StrategiaZmianyKariery{
    public Rewolucjonista(){
        nazwa = Zmiana.REWOLUCJONISTA;
    }

    @Override
    @Nullable
    public KarieraRobotnika zmienKariere() {
        return null;//todo
    }
}
