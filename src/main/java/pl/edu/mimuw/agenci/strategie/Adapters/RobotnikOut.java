package pl.edu.mimuw.agenci.strategie.Adapters;

import pl.edu.mimuw.agenci.Robotnik;

public class RobotnikOut extends RobotnikReader {

    public RobotnikOut(Robotnik robotnik){
        id = robotnik.getId();
        zasobyReader = new ZasobyOut(robotnik.getZasoby());
        poziom = robotnik.getAktualny_poziom();
        kariera = robotnik.getAktualna_kariera();
        kupowanie = robotnik.getKupowanie();
        produkcja = robotnik.getProdukcja();
        uczenie = robotnik.getUczenie();;
        zmiana = robotnik.getZmiana();
        produktywnosc = robotnik.getProduktywnosc();
    }


}
