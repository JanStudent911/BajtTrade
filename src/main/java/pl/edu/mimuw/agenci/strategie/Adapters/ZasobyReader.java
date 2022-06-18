package pl.edu.mimuw.agenci.strategie.Adapters;

import pl.edu.mimuw.agenci.Zasoby;
import pl.edu.mimuw.produkty.JedzeniePaczka;
import pl.edu.mimuw.produkty.Narzedzie;
import pl.edu.mimuw.produkty.ProgramKomp;
import pl.edu.mimuw.produkty.Ubranie;

import java.util.ArrayList;
import java.util.List;

public class ZasobyReader {
    protected double diamenty;
    protected int jedzenie;
    protected int programy;
    protected int ubrania;
    protected int narzedzia;



    public ZasobyReader() {}

    public Zasoby build(){

        final int POZIOM_STARTOWY = 1;

        JedzeniePaczka jedzeniePaczka = new JedzeniePaczka(jedzenie);
        List<Ubranie> ubrania_list;
        List<Narzedzie> narzedzia_list;
        List<ProgramKomp> programy_list;

        ubrania_list = new ArrayList<>();
        narzedzia_list = new ArrayList<>();
        programy_list = new ArrayList<>();
//
//        diamenty = d;
//        jedzenie = j;

        for(int i = 0; i < ubrania; i++){
            Ubranie ubranie = new Ubranie(POZIOM_STARTOWY);
            ubrania_list.add(ubranie);
        }

        for(int i = 0; i < narzedzia; i++){
            Narzedzie narzedzie = new Narzedzie(POZIOM_STARTOWY);
            narzedzia_list.add(narzedzie);
        }

        for (int i = 0; i < programy; i++){
            ProgramKomp program = new ProgramKomp(POZIOM_STARTOWY);
            programy_list.add(program);
        }


        return new Zasoby(diamenty, jedzeniePaczka, ubrania_list, narzedzia_list, programy_list);
    }
}
