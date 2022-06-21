package pl.edu.mimuw;


import pl.edu.mimuw.produkty.Produkty;

public class Ceny{
    private double programy;
    private double jedzenie;
    private double ubrania;
    private double narzedzia;

    public Ceny(){}

    public String toString() {
        return ("Programy: "+programy+"\nJedzenie: "+jedzenie+"\nUbrania: "+ubrania+"\nNarzędzia: "+narzedzia+"\n");
    }

    public double getCena(Produkty p){
        double odp;
        switch (p){
            case JEDZENIE:
                odp = jedzenie;
                break;
            case UBRANIA:
                odp = ubrania;
                break;
            case NARZEDZIA:
                odp = narzedzia;
                break;
            case PROGRAMY:
                odp = programy;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + p);
        }
        return odp;
    }
}

