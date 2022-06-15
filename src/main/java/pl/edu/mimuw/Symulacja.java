package pl.edu.mimuw;



import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.Spekulant;


import java.util.Collections;
import java.util.List;

public class Symulacja {
    public Info info;
    private List<Robotnik> robotnicy;
    private List<Spekulant> spekulanci;

    public final transient double limit_diamentow;
    public final transient double okresowosc_nauki;


    public List<Robotnik> getRobotnicy() {
        return Collections.unmodifiableList(robotnicy);
    }

    public List<Spekulant> getSpekulanci() {
        return Collections.unmodifiableList(spekulanci);
    }


    public Symulacja(Info info, List<Robotnik> robotnicy, List<Spekulant> spekulanci,
                      double limit_d, double okresowosc){
        this.info = info;
        this.robotnicy = robotnicy;
        this.spekulanci = spekulanci;
        this.limit_diamentow = limit_d;
        this.okresowosc_nauki = okresowosc;


        for (Robotnik r : robotnicy) {
            r.setMojaSymulacja(this);
        }
        for (Spekulant s : spekulanci) {
            s.setMojaSymulacja(this);
        }
    }
}
