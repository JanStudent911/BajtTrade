package pl.edu.mimuw.agenci;

import pl.edu.mimuw.produkty.Produkty;

import java.io.IOException;

public class Produktywnosc {

    private int diamenty;
    private int jedzenie;
    private int programy;
    private int ubrania;
    private int narzedzia;

    public int getIlosc(Produkty p) throws IOException {
        switch (p){
            case UBRANIA:
                return ubrania;
            case DIAMENTY:
                return diamenty;
            case JEDZENIE:
                return jedzenie;
            case PROGRAMY:
                return programy;
            case NARZEDZIA:
                return narzedzia;
            default:
                throw new IOException("zla wartosc enum Produkty");
        }
    }
}
