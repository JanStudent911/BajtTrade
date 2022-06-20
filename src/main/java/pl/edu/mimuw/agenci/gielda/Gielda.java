package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.OfertaSpekulanta;
import pl.edu.mimuw.agenci.Robotnik;

import java.util.List;

public abstract class Gielda {
    private List<Robotnik> robotnicyNaGieldzie;
    private List<OfertaSpekulanta> ofertyKupnaSpekulantow;
    private List<OfertaSpekulanta> ofertySprzedażySpekulantow;
    private List<HistoriaCenDnia> historiaCen;

    public void setRobotnicyNaGieldzie(List<Robotnik> robotnicyNaGieldzie) {
        this.robotnicyNaGieldzie = robotnicyNaGieldzie;
    }
}
