package pl.edu.mimuw.agenci.strategie.Readers;

import pl.edu.mimuw.agenci.KarieraRobotnika;
import pl.edu.mimuw.agenci.Produktywnosc;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.strategie.kupowania.StrategiaKupowania;
import pl.edu.mimuw.agenci.strategie.produkowania.StrategiaProdukowania;
import pl.edu.mimuw.agenci.strategie.uczenia.StrategiaUczenia;
import pl.edu.mimuw.agenci.strategie.zmiany.Konserwatysta;
import pl.edu.mimuw.agenci.strategie.zmiany.Rewolucjonista;
import pl.edu.mimuw.agenci.strategie.zmiany.StrategiaZmianyKariery;

import java.io.IOException;

public class RobotnikReader extends AgentReader {
    protected int poziom;
    protected KarieraRobotnika kariera;
    protected StrategiaKupowania kupowanie;
    protected StrategiaProdukowania produkcja;
    protected StrategiaUczenia uczenie;
    protected Zmiana zmiana;
    protected Produktywnosc produktywnosc;


    public RobotnikReader(){
        super();
    }


    public Robotnik build() throws IOException {
        StrategiaZmianyKariery z;
        switch (zmiana){
            case REWOLUCJONISTA:
                z = new Rewolucjonista();
                break;
            case KONSERWATYSTA:
                z = new Konserwatysta();
                break;
            default:
                throw new IOException("blad wczytania kariery");
        }

        return new Robotnik(id, zasobyReader.build(), kariera, poziom, kupowanie, produkcja, uczenie, z, produktywnosc);
    }


}
