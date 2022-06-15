package pl.edu.mimuw.agenci.strategie.uczenia;

import pl.edu.mimuw.agenci.Robotnik;

public interface IStrategiaUczenia {
    public boolean pracujDecyzja();
    public void setMojRobotnik(Robotnik mojRobotnik);
}
