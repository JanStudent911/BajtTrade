package pl.edu.mimuw.agenci.strategie.Adapters;

import pl.edu.mimuw.agenci.spekulant.Spekulant;

public class SpekulantOut extends SpekulantReader{

    public SpekulantOut(Spekulant spekulant){
        id = spekulant.getId();
        zasobyReader = new ZasobyOut(spekulant.getZasoby());
        kariera = spekulant.getKariera();
    }
}
