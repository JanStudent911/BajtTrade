package pl.edu.mimuw;

import pl.edu.mimuw.agenci.Robotnik;

import java.util.List;

public abstract class Gielda {
    private List<Robotnik> robotnicyNaGieldzie;
    private List<OfertaSpekulanta> ofertyKupnaSpekulantow;
    private List<OfertaSpekulanta> ofertySprzedażySpekulantow;

    public void setRobotnicyNaGieldzie(List<Robotnik> robotnicyNaGieldzie) {
        this.robotnicyNaGieldzie = robotnicyNaGieldzie;
    }
}
