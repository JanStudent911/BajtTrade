package pl.edu.mimuw.agenci.strategie.Adapters;

import pl.edu.mimuw.Symulacja;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.spekulant.Spekulant;

import java.util.ArrayList;

public class SymulacjaOut extends SymulacjaReader {

    public SymulacjaOut(Symulacja symulacja){
        info = symulacja.info;
        robotnicy = new ArrayList<>();
        spekulanci = new ArrayList<>();

        for (Robotnik i : symulacja.getRobotnicy()) {
            robotnicy.add(new RobotnikOut(i));
        }

        for (Spekulant i : symulacja.getSpekulanci()) {
            spekulanci.add(new SpekulantOut(i));
        }

    }
}
