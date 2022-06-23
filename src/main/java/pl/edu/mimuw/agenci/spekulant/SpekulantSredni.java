package pl.edu.mimuw.agenci.spekulant;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;
import pl.edu.mimuw.agenci.gielda.TypStat;
import pl.edu.mimuw.produkty.Produkty;

import java.util.Arrays;

import static java.lang.Math.max;

public class SpekulantSredni extends StrategiaSpekulanta{
    private int historia_spekulanta_sredniego;
    private static transient final int marzaKupna = 10;
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

    private double policzBazowaSrednia(Produkty p){
        int dni = mojSpekulant.getMojaSymulacja().info.getDzien() - 1;//tyle dni historii mamy
        double srednia = 0;
        for(int i = 0; i < historia_spekulanta_sredniego; i++){
           srednia += mojSpekulant.getMojaSymulacja().getGielda().getCenaHistoryczna(TypStat.SR_ARYT,p, max(dni-i, 0));
        }
        return srednia/historia_spekulanta_sredniego;
    }

    @Override
    public OfertaSpekulanta budujOferteKupna() {
        return new OfertaSpekulanta(ILE_KUPUE_SPEKULANT, Produkty.JEDZENIE, policzBazowaSrednia(Produkty.JEDZENIE)
                *(100-marzaKupna)/100);
    }

    @Override
    public OfertaSpekulanta budujOferteSprzedazy() {
        return new OfertaSpekulanta(mojSpekulant.getZasoby().getJedzenie().getIlosc(), Produkty.JEDZENIE, policzBazowaSrednia(Produkty.JEDZENIE)
                *(100+marzaSprzedazy)/100);
    }
}
