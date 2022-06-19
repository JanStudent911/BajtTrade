package pl.edu.mimuw;



import org.jetbrains.annotations.NotNull;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.spekulant.Spekulant;


import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Symulacja {
    public Info info;
    private List<Robotnik> robotnicy;
    private List<Spekulant> spekulanci;
    public transient Random random;


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
        random = new Random();



        for (Robotnik r : robotnicy) {
            r.setMojaSymulacja(this);
        }
        for (Spekulant s : spekulanci) {
            s.setMojaSymulacja(this);
        }
    }

    public void symuluj(){

        while(info.getDzien() < info.getDlugosc()){
            info.nowyDzien();
            robotnicyProdukujaUcza();
            gieldaPrzyjmujeOferty();
            gieldaRealizujeTransakcje();
            robotnicyZuzywajaZapasy();
        }

    }

    public List<Robotnik> robotnicyProdukujaUcza(){
        List<Robotnik> robotnicyGielda= new ArrayList<Robotnik>();
        for (Robotnik r :
                robotnicy) {
            if (r.getUczenie().pracujDecyzja()) {
                robotnicyGielda.add(r);
                r.produ
            }
            }
    }


}
