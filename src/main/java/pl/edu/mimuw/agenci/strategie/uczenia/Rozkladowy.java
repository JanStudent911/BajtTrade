package pl.edu.mimuw.agenci.strategie.uczenia;

import java.util.Random;

public class Rozkladowy extends StrategiaUczenia {
   // private transient Random random;
    public Rozkladowy(){
  //      random = new Random();
    }
    @Override
    public boolean pracujDecyzja() {
        double x = 1.0/(1.0 + mojaSymulacja.info.getDzien());
        double r = mojaSymulacja.random.nextDouble();
        return r > x;
    }
}
