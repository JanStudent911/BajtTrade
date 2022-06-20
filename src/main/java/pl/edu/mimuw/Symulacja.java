package pl.edu.mimuw;


import org.jetbrains.annotations.NotNull;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.spekulant.Spekulant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Symulacja {
    public Info info;
    public transient Random random;
    private final List<Robotnik> robotnicy;
    private transient Gielda gielda;
    private final List<Spekulant> spekulanci;


    public Symulacja(Info info, @NotNull List<Robotnik> robotnicy, @NotNull List<Spekulant> spekulanci) {
        this.info = info;
        this.robotnicy = robotnicy;
        this.spekulanci = spekulanci;
        random = new Random();


        for (Robotnik r : robotnicy) {
            r.setMojaSymulacja(this);
        }
        for (Spekulant s : spekulanci) {
            s.setMojaSymulacja(this);
        }
    }

    public List<Robotnik> getRobotnicy() {
        return Collections.unmodifiableList(robotnicy);
    }

    public List<Spekulant> getSpekulanci() {
        return Collections.unmodifiableList(spekulanci);
    }

    public void symuluj() throws IOException {
        while (info.getDzien() < info.getDlugosc()) {
            info.nowyDzien();
            gielda.setRobotnicyNaGieldzie(getRobotnicyNaGieldzie());
            gieldaPrzyjmujeOferty();
            gieldaRealizujeTransakcje();
            robotnicyZuzywajaZapasy();
        }

    }

    public List<Robotnik> getRobotnicyNaGieldzie() throws IOException {
        List<Robotnik> robotnicyGielda = new ArrayList<Robotnik>();
        for (Robotnik r : robotnicy) {
            if (r.getUczenie().pracujDecyzja()) {
                robotnicyGielda.add(r);
                r.szykujNaGielde();
            }
        }
        return robotnicyGielda;
    }

    public void gieldaPrzyjmujeOferty() {
    //todo
    }

    public void gieldaRealizujeTransakcje(){
        //todo
    }

    public void robotnicyZuzywajaZapasy(){
        //todo
    }


}
