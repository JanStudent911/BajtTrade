package pl.edu.mimuw;

import pl.edu.mimuw.agenci.Agent;
import pl.edu.mimuw.produkty.Produkt;
import pl.edu.mimuw.produkty.Produkty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oferta {
    protected int ilosc;
    protected List<Produkt> obiekty;
    protected Produkty rodzaj_produktu;
    protected Agent mojAgent;

    public Oferta(int ilosc, Produkty rodzaj_produktu, Agent mojAgent) {
        this.ilosc = ilosc;
        this.rodzaj_produktu = rodzaj_produktu;
        this.mojAgent = mojAgent;
        this.obiekty = new ArrayList<Produkt>();
    }

    public void dodajObiekty(ArrayList<Produkt> obiekty){
        this.obiekty.addAll(obiekty);

    }

    public int getIlosc() {
        return ilosc;
    }

    public Produkty getRodzaj_produktu() {
        return rodzaj_produktu;
    }

    public Agent getMojAgent() {
        return mojAgent;
    }

    public void zabierzSztuki(int x){
        ilosc -= x;
    }

    public List<Produkt> getObiekty(int ile){
        List<Produkt> przekazywane = new ArrayList<>();
        for(int i = 0; i < ile; i++){
            if(obiekty.isEmpty()){throw new RuntimeException("zabierasz za duzo obiektow");}
            przekazywane.add(obiekty.get(0));
            obiekty.remove(0);
        }
        zabierzSztuki(ile);
        assert (ilosc == obiekty.size());
        return przekazywane;
    }
}
