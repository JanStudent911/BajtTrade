package pl.edu.mimuw.agenci.strategie.uczenia;

public class Okresowy extends StrategiaUczenia{
    @Override
    public boolean pracujDecyzja() {
        return getMojRobotnik().getMojaSymulacja().info.getDzien() % getMojRobotnik().getMojaSymulacja().okresowosc_nauki == 0;
    }
}
