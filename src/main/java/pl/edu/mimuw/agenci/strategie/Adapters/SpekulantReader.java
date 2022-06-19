package pl.edu.mimuw.agenci.strategie.Adapters;

import pl.edu.mimuw.agenci.spekulant.*;

import java.io.IOException;

public class SpekulantReader extends AgentReader {
    public SpekulantReader() {
        super();
    }

    protected KarieraSpekulanta kariera;

    public Spekulant build() throws IOException {
        StrategiaSpekulanta s;
        switch (kariera){
            case SREDNI:
                s = new SpekulantSredni();
                break;
            case WYPUKLY:
                s = new SpekulantWypukly();
                break;
            case REGULUJACY:
                s = new SpekulantRegulujacy();
                break;
            default:
                throw new IOException("blad wczytania Spekulanta");
        }
        s.build();
        return new Spekulant(id, zasobyReader.build(), s);
    }



}

