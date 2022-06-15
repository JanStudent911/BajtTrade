package pl.edu.mimuw.agenci;


import com.squareup.moshi.ToJson;
import pl.edu.mimuw.produkty.Narzedzie;
import pl.edu.mimuw.produkty.ProgramKomp;
import pl.edu.mimuw.produkty.Ubranie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zasoby {
        protected double diamenty;
        protected int jedzenie;
        protected List<Ubranie> ubrania;
        protected List<Narzedzie> narzedzia;
        protected List<ProgramKomp> programy;


    public double getDiamenty() {
        return diamenty;
    }

    public int getJedzenie() {
        return jedzenie;
    }

    public List<Ubranie> getUbrania() {
        return Collections.unmodifiableList(ubrania);
    }

    public List<Narzedzie> getNarzedzia() {
        return Collections.unmodifiableList(narzedzia);
    }

    public List<ProgramKomp> getProgramy() {
        return Collections.unmodifiableList(programy);
    }

    public Zasoby (double d, int j, List<Ubranie> u,
                   List<Narzedzie> n, List<ProgramKomp> p){
            diamenty = d;
            jedzenie = j;
            ubrania = u;
            narzedzia = n;
            programy = p;
        }

}
