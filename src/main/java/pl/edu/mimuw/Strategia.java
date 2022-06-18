package pl.edu.mimuw;

import pl.edu.mimuw.agenci.Robotnik;

public abstract class Strategia {

    protected transient Robotnik mojRobotnik;
    protected transient Symulacja mojaSymulacja;

    public void setMojeDane(Robotnik mojRobotnik) {
        this.mojRobotnik = mojRobotnik;
        this.mojaSymulacja = mojRobotnik.getMojaSymulacja();
    }
}
