package pl.edu.mimuw.agenci.strategie.Adapters;

import pl.edu.mimuw.agenci.Spekulant;

public class SpekulantReader extends AgentReader {


    protected String kariera;

    public Spekulant build(){
        return new Spekulant(id, zasobyReader.build(), kariera);
    }



}
