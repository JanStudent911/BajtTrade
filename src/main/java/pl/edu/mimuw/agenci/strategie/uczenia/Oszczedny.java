package pl.edu.mimuw.agenci.strategie.uczenia;

public class Oszczedny extends StrategiaUczenia{

    private double limit_diamentow;
    @Override
    public boolean pracujDecyzja() {
        return mojRobotnik.getZasoby().getDiamenty() < limit_diamentow;
    }
}
