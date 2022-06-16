package pl.edu.mimuw.agenci.strategie.zmiany;

import org.jetbrains.annotations.Nullable;
import pl.edu.mimuw.agenci.KarieraRobotnika;
import pl.edu.mimuw.agenci.strategie.Adapters.Zmiana;

public class Konserwatysta extends StrategiaZmianyKariery{
    public Konserwatysta(){
        nazwa = Zmiana.KONSERWATYSTA;
    }

    @Override
    @Nullable
    public KarieraRobotnika zmienKariere() {
        return null;
    }
}


