package pl.edu.mimuw.agenci;

import com.squareup.moshi.Json;
import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.Symulacja;
import pl.edu.mimuw.agenci.strategie.Adapters.Zmiana;
import pl.edu.mimuw.agenci.strategie.kupowania.StrategiaKupowania;
import pl.edu.mimuw.agenci.strategie.produkowania.StrategiaProdukowania;
import pl.edu.mimuw.agenci.strategie.uczenia.StrategiaUczenia;
import pl.edu.mimuw.agenci.strategie.zmiany.StrategiaZmianyKariery;
import pl.edu.mimuw.produkty.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Robotnik extends Agent {


    @Json(name = "poziom")
    private int aktualny_poziom;
    private transient Map<KarieraRobotnika, Integer> poziomy;
    @Json(name = "kariera")
    KarieraRobotnika aktualna_kariera;
    private StrategiaKupowania kupowanie;
    private StrategiaProdukowania produkcja;
    private StrategiaUczenia uczenie;
    private StrategiaZmianyKariery zmiana;
    private Produktywnosc produktywnosc;
    private transient Oferta nowo_wyprodukowane;
    private transient Oferta planZakupy;
    private transient boolean bylemNaGieldzie;

//getters
    public int getAktualny_poziom() {
        return aktualny_poziom;
    }

    public KarieraRobotnika getAktualna_kariera() {
        return aktualna_kariera;
    }

    public StrategiaKupowania getKupowanie() {
        return kupowanie;
    }

    public StrategiaProdukowania getProdukcja() {
        return produkcja;
    }

    public StrategiaUczenia getUczenie() {
        return uczenie;
    }

    public Produktywnosc getProduktywnosc() {
        return produktywnosc;
    }

    public Zmiana getZmiana() {
        return zmiana.getNazwa();
    }

    public Oferta getNowo_wyprodukowane() {
        return nowo_wyprodukowane;
    }

    public Oferta getPlanZakupy() {
        return planZakupy;
    }
    //endgetters

    public Robotnik(int id, Zasoby zasoby, KarieraRobotnika kariera, int poziom,
                    StrategiaKupowania kupowanie, StrategiaProdukowania produkcja,
                    StrategiaUczenia uczenie, StrategiaZmianyKariery zmiana,
                    Produktywnosc produktywnosc){
        super(id, zasoby);
        poziomy = new HashMap<>();
        aktualna_kariera = kariera;
        aktualny_poziom = poziom;
        poziomy.put(aktualna_kariera, poziom);
        for( KarieraRobotnika k : KarieraRobotnika.values()){
            poziomy.putIfAbsent(k, 1);
        }

        this.kupowanie = kupowanie;
        this.produkcja = produkcja;
        produkcja.setMojeDane(this);
        this.uczenie = uczenie;

        this.zmiana = zmiana;
        this.produktywnosc = produktywnosc;
        nowo_wyprodukowane = null;
        bylemNaGieldzie = false;
    }

    @Override
    public void setMojaSymulacja(Symulacja mojaSymulacja){
        this.mojaSymulacja = mojaSymulacja;
        uczenie.setMojeDane(this);
        produkcja.setMojeDane(this);



    }





    public void szykujNaGielde() throws IOException {
        nowo_wyprodukowane = produkcja.produkujOferte();
        produkuj();
        planZakupy = kupowanie.budujOfertęKupna();
    }

    private void produkuj(){
        ArrayList<Produkt> obiekty = new ArrayList();
        switch (nowo_wyprodukowane.getRodzaj_produktu()){
            case DIAMENTY:
                break;
            case JEDZENIE:
                obiekty.add(new JedzeniePaczka(nowo_wyprodukowane.getIlosc()));
                break;
            case NARZEDZIA:
                for(int i = 0; i < getNowo_wyprodukowane().getIlosc(); i++){
                    obiekty.add(new Narzedzie(1));
                }
                break;
            case PROGRAMY:
                for(int i = 0; i < getNowo_wyprodukowane().getIlosc(); i++){
                    obiekty.add(new ProgramKomp(1));
                }
                break;
            case UBRANIA:
                for(int i = 0; i < getNowo_wyprodukowane().getIlosc(); i++){
                    obiekty.add(new Ubranie(1));
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + nowo_wyprodukowane.getRodzaj_produktu());
        }
        if(!obiekty.isEmpty()){
            nowo_wyprodukowane.dodajObiekty(obiekty);
        }
    }

    public boolean getBylemNaGieldzie(){
        return bylemNaGieldzie;
    }

    public void setBylemNaGieldzie(boolean bylem){
        bylemNaGieldzie = bylem;
    }

    public void sprzedawaj(){

    }


}
