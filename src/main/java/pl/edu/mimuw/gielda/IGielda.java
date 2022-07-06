package pl.edu.mimuw.gielda;

import pl.edu.mimuw.Symulacja;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.spekulant.Spekulant;
import pl.edu.mimuw.produkty.Produkty;

import java.util.List;

public interface IGielda {
    double getCenaHistoryczna(TypStat typ, Produkty p, int dzien);
    double policzSredniaZIleDni(Produkty p, int ileDni);
    void setMojaSymulacja(Symulacja mojaSymulacja);
    void setRobotnicyNaGieldzie(List<Robotnik> robotnicyNaGieldzie);

    void przyjmijOferty(Spekulant s);

    Robotnik wskazNastRobotnika();



    }
