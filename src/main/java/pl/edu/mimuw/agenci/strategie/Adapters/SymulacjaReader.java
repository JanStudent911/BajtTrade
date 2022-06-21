package pl.edu.mimuw.agenci.strategie.Adapters;

import pl.edu.mimuw.Info;
import pl.edu.mimuw.Symulacja;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.gielda.Gielda;
import pl.edu.mimuw.agenci.gielda.GieldaSocjalistyczna;
import pl.edu.mimuw.agenci.spekulant.Spekulant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SymulacjaReader {
    public Info info;
    protected List<RobotnikReader> robotnicy;
    protected List<SpekulantReader> spekulanci;

    public SymulacjaReader(){}

    public Symulacja build() throws IOException {
        List<Robotnik> r = new ArrayList<>();
        for(RobotnikReader i : robotnicy){
            r.add(i.build());
        }

        List<Spekulant> s = new ArrayList<>();
        for(SpekulantReader i : spekulanci){
            s.add(i.build());
        }
        Gielda gielda;
        switch(info.getGielda()){
            case "socjalistyczna":
                    gielda = new GieldaSocjalistyczna();
                    break; //todo
            default:
                    throw new IllegalStateException("Unexpected value: " + info.getGielda());
        }

        return new Symulacja(info, r, s, gielda);

    }
}
