package pl.edu.mimuw;



import org.jetbrains.annotations.NotNull;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.Spekulant;


import java.util.Collections;
import java.util.List;

public class Symulacja {
    public Info info;
    private List<Robotnik> robotnicy;
    private List<Spekulant> spekulanci;


    public List<Robotnik> getRobotnicy() {
        return Collections.unmodifiableList(robotnicy);
    }

    public List<Spekulant> getSpekulanci() {
        return Collections.unmodifiableList(spekulanci);
    }


    public Symulacja(Info info, @NotNull List<Robotnik> robotnicy, @NotNull List<Spekulant> spekulanci){
        this.info = info;
        this.robotnicy = robotnicy;
        this.spekulanci = spekulanci;



        for (Robotnik r : robotnicy) {
            r.setMojaSymulacja(this);
        }
        for (Spekulant s : spekulanci) {
            s.setMojaSymulacja(this);
        }
    }
}
