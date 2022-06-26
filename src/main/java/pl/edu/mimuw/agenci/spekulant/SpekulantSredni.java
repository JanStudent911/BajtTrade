package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;
import pl.edu.mimuw.agenci.gielda.TypStat;
import pl.edu.mimuw.produkty.Produkty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.max;

public class SpekulantSredni extends StrategiaSpekulanta{
    private final int historia_spekulanta_sredniego;
    private static transient final int marzaKupna = 10;
    private static transient final int krytMarzaKupna = 5;
    private static transient final int marzaSprzedazy = 10;


    public KarieraSpekulanta getKariera() {
        return KarieraSpekulanta.SREDNI;
    }

    public SpekulantSredni(int historia) {
        this.historia_spekulanta_sredniego = historia;

    }

    public void build(){
        //arrayHistoria = new double[historia_spekulanta_sredniego];
    }


    @Override
    public List<OfertaSpekulanta> budujOferteKupna() {
        List<OfertaSpekulanta> oferty = new ArrayList<>();
        for (Produkty p : Produkty.values()) {
            if (p != Produkty.DIAMENTY){
                if (mojSpekulant.getZasoby().getIleZasobow(p) == 0){
                    oferty.add(new OfertaSpekulanta(ILE_KUPUE_SPEKULANT, p,mojSpekulant.getMojaSymulacja().getGielda().policzSredniaZIleDni(p, historia_spekulanta_sredniego)
                            *(100-krytMarzaKupna)/100));
                }else {
                    oferty.add(new OfertaSpekulanta(ILE_KUPUE_SPEKULANT, p,
                            mojSpekulant.getMojaSymulacja().getGielda().policzSredniaZIleDni(p, historia_spekulanta_sredniego)
                                    * (100 - marzaKupna) / 100));
                }
            }
        }
        return oferty;
    }

    @Override
    public List<OfertaSpekulanta> budujOferteSprzedazy() {//todo to jest uproszczona wersja bez poziomow zaawansowania
        List<OfertaSpekulanta> oferty = new ArrayList<>();
        for (Produkty p : Produkty.values()) {
            if (p != Produkty.DIAMENTY) {
                int i = mojSpekulant.getZasoby().getIleZasobow(p);
                if (i > 0){
                    oferty.add(new OfertaSpekulanta(i, p,
                            mojSpekulant.getMojaSymulacja().getGielda()
                                    .policzSredniaZIleDni(p, historia_spekulanta_sredniego)
                            * (100 + marzaSprzedazy) / 100));
                }
            }
        }
        return oferty;
    }
}
