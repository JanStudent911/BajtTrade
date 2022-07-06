package pl.edu.mimuw.gielda;

import pl.edu.mimuw.agenci.Robotnik;

public class GieldaSocjalistyczna extends Gielda{
    public GieldaSocjalistyczna() {
        super();

    }

    @Override
    public Robotnik wskazNastRobotnika() {//sort? meeeh
        double min = -1;
        int idMin = -1;
        Robotnik wybrany = null;
        for (Robotnik r : robotnicyNaGieldzie) {
            double d = r.getZasoby().getDiamenty();
            int id = r.getId();
            if(min < 0 || d < min || d == min && id < idMin){
                if(!r.getBylemNaGieldzie())
                    idMin = id;
                    min = d;
                    wybrany = r;
            }
        }
        if(wybrany != null) {
            wybrany.setBylemNaGieldzie(true);
        }
        return wybrany;
    }
}
