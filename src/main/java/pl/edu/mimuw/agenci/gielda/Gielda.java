package pl.edu.mimuw.agenci.gielda;

import pl.edu.mimuw.OfertaSpekulanta;
import pl.edu.mimuw.Symulacja;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.spekulant.Spekulant;
import pl.edu.mimuw.produkty.Produkty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Gielda {
    private List<Robotnik> robotnicyNaGieldzie;
    private List<OfertaSpekulanta> ofertyKupnaSpekulantow;
    private List<OfertaSpekulanta> ofertySprzedazySpekulantow;
    private List<HistoriaCenDnia> historiaCen;
    private Symulacja mojaSymulacja;

    public Gielda() {
        ofertyKupnaSpekulantow = new ArrayList<OfertaSpekulanta>();
        ofertySprzedazySpekulantow = new ArrayList<OfertaSpekulanta>();
        historiaCen = new ArrayList<HistoriaCenDnia>();
        ustawCenyDniaZero();
    }

    private void ustawCenyDniaZero() {
        historiaCen.add(new HistoriaCenDnia(0));
        for (Produkty p : Produkty.values()) {
            historiaCen.get(0).notuj(p, mojaSymulacja.info.getCeny().getCena(p), 1);
        }

    }

    public void setRobotnicyNaGieldzie(List<Robotnik> robotnicyNaGieldzie) {
        this.robotnicyNaGieldzie = robotnicyNaGieldzie;
    }
    public void setMojaSymulacja(Symulacja mojaSymulacja) {
        this.mojaSymulacja = mojaSymulacja;
    }

    public void przyjmijOferty(Spekulant s){
        ofertyKupnaSpekulantow.add(s.budujOferteKupna());
        ofertySprzedazySpekulantow.add(s.budujOferteSprzedazy());
    }


}
