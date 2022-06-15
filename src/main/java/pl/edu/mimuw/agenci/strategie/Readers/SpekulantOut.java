package pl.edu.mimuw.agenci.strategie.Readers;

import pl.edu.mimuw.agenci.Spekulant;

public class SpekulantOut extends SpekulantReader{

    public SpekulantOut(Spekulant spekulant){
        id = spekulant.getId();
        zasobyReader = new ZasobyOut(spekulant.getZasoby());
        kariera = spekulant.getKariera();
    }
}
