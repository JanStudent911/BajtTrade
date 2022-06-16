package pl.edu.mimuw.agenci.strategie.uczenia;

import pl.edu.mimuw.Symulacja;
import pl.edu.mimuw.agenci.Robotnik;

public abstract class  StrategiaUczenia implements IStrategiaUczenia{

    protected transient Robotnik mojRobotnik;
    protected transient Symulacja mojaSymulacja;

    public void setMojeDane(Robotnik mojRobotnik) {
        this.mojRobotnik = mojRobotnik;
        this.mojaSymulacja = mojRobotnik.getMojaSymulacja();
    }


}
