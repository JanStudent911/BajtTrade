package pl.edu.mimuw.agenci;

import com.squareup.moshi.Json;
import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.agenci.strategie.Adapters.Zmiana;
import pl.edu.mimuw.agenci.strategie.kupowania.StrategiaKupowania;
import pl.edu.mimuw.agenci.strategie.produkowania.StrategiaProdukowania;
import pl.edu.mimuw.agenci.strategie.uczenia.StrategiaUczenia;
import pl.edu.mimuw.agenci.strategie.zmiany.StrategiaZmianyKariery;

import java.io.IOException;
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
        this.uczenie = uczenie;
        this.zmiana = zmiana;
        this.produktywnosc = produktywnosc;
        nowo_wyprodukowane = null;
        uczenie.setMojeDane(this);
    }

    public void szykujNaGielde() throws IOException {
        nowo_wyprodukowane = produkcja.produkujOferte();
        planZakupy = kupowanie.budujOfertęKupna();
    }


}
