package pl.edu.mimuw;



import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.Spekulant;


import java.util.Collections;
import java.util.List;

public class Symulacja {
    public Info info;

    public List<Robotnik> getRobotnicy() {
        return Collections.unmodifiableList(robotnicy);
    }

    public List<Spekulant> getSpekulanci() {
        return Collections.unmodifiableList(spekulanci);
    }

    private List<Robotnik> robotnicy;
    private List<Spekulant> spekulanci;

    public Symulacja(Info info, List<Robotnik> robotnicy, List<Spekulant> spekulanci){
        this.info = info;
        this.robotnicy = robotnicy;
        this.spekulanci = spekulanci;
    }

    @Override
    public String toString() {
        return "Symulacja{" +
                "info=" + info +
                ", robotnicy=" + robotnicy +
                ", spekulanci=" + spekulanci +
                '}';
    }
}
