package pl.edu.mimuw.agenci.strategie.uczenia;

import pl.edu.mimuw.agenci.Robotnik;

public abstract class  StrategiaUczenia implements IStrategiaUczenia{
    private int zapas;
    private int okres;
    private transient Robotnik mojRobotnik;

    public void setMojRobotnik(Robotnik mojRobotnik) {
        this.mojRobotnik = mojRobotnik;
    }

    public Robotnik getMojRobotnik() {
        return mojRobotnik;
    }
}
