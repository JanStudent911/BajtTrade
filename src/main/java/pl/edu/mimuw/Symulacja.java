package pl.edu.mimuw;


import org.jetbrains.annotations.NotNull;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.gielda.Gielda;
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
    private final transient Gielda gielda;
    private final List<Spekulant> spekulanci;


    public Symulacja(Info info, @NotNull List<Robotnik> robotnicy, @NotNull List<Spekulant> spekulanci,
                     Gielda gielda) {
        this.info = info;
        this.robotnicy = robotnicy;
        this.gielda = gielda;
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

    public Gielda getGielda() {
        return gielda;
    }

    public void symuluj() throws IOException {
        gielda.setMojaSymulacja(this);
//        dzien zero

        while (info.getDzien() < info.getDlugosc()) {
            info.nowyDzien();
            gielda.setRobotnicyNaGieldzie(getRobotnicyNaGieldzie());
            gieldaPrzyjmujeOferty();
            gieldaRealizujeTransakcje();//todo
            robotnicyZuzywajaZapasy();//todo
        }

    }

    public List<Robotnik> getRobotnicyNaGieldzie() throws IOException {
        List<Robotnik> robotnicyGielda = new ArrayList<Robotnik>();
        for (Robotnik r : robotnicy) {
            if (r.getUczenie().pracujDecyzja()) {
                r.szykujNaGielde();
                robotnicyGielda.add(r);
            }
        }
        return robotnicyGielda;
    }

    private void gieldaPrzyjmujeOferty() {
        for(Spekulant s : spekulanci){
            gielda.przyjmijOferty(s);
        }
    }

    private void gieldaRealizujeTransakcje() {
        gielda.realizujTransakcje();//todo

    }

    private void robotnicyZuzywajaZapasy(){
        //todo
    }


}
