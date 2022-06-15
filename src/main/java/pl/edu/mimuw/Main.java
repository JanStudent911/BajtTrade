package pl.edu.mimuw;


import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import okio.Okio;
import pl.edu.mimuw.agenci.strategie.Adapters.SymulacjaReader;
import pl.edu.mimuw.agenci.strategie.kupowania.*;
import pl.edu.mimuw.agenci.strategie.produkowania.*;
import pl.edu.mimuw.agenci.strategie.uczenia.*;
import pl.edu.mimuw.agenci.strategie.zmiany.Konserwatysta;
import pl.edu.mimuw.agenci.strategie.zmiany.Rewolucjonista;
import pl.edu.mimuw.agenci.strategie.zmiany.StrategiaZmianyKariery;

import java.io.IOException;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) throws IOException {
        JsonReader reader = JsonReader.of(Okio.buffer(Okio.source(Paths.get(
                "/Users/janek/Documents/INFORMATYKA/PO/BT/src/main/resources/wejście_v_1_0_1.json"
        ))));

        Moshi moshi = new Moshi.Builder()
                .add(
                PolymorphicJsonAdapterFactory.of(StrategiaKupowania.class, "typ")
                        .withSubtype(Gadzeciarz.class, "gadzeciarz")
                        .withSubtype(Czyscioszek.class, "czyscioszek")
                        .withSubtype(Technofob.class, "technofob")
                        .withSubtype(Zmechanizowany.class, "zmechanizowany"))
                .add(PolymorphicJsonAdapterFactory.of(StrategiaProdukowania.class, "typ")
                        .withSubtype(Chciwy.class, "chciwy")
                        .withSubtype(Krotkowzroczny.class, "krotkowzroczny")
                        .withSubtype(Losowy.class, "losowy")
                        .withSubtype(Perspektywiczny.class, "perspektywiczny")
                        .withSubtype(Sredniak.class, "sredniak"))
                .add(PolymorphicJsonAdapterFactory.of(StrategiaUczenia.class, "typ")
                        .withSubtype(Student.class, "student")
                        .withSubtype(Pracus.class, "pracus")
                        .withSubtype(Okresowy.class, "okresowy")
                        .withSubtype(Oszczedny.class, "oszczedny")
                        .withSubtype(Rozkladowy.class, "rozkladowy"))
                .add(PolymorphicJsonAdapterFactory.of(StrategiaZmianyKariery.class, "zmiana")
                        .withSubtype(Rewolucjonista.class, "rewolucjonista")
                        .withSubtype(Konserwatysta.class, "konserwatysta"))
                .build();


        JsonAdapter<SymulacjaReader> jsonAdapter = moshi.adapter(SymulacjaReader.class);
        SymulacjaReader symulacjaReader = jsonAdapter.fromJson(reader);




        //Moshi moshi_out = new Moshi.Builder().add(new ZasobyAdapter()).build();

        JsonAdapter<Symulacja> symulacjaJsonAdapter = moshi.adapter(Symulacja.class);

        assert symulacjaReader != null;
        Symulacja symulacja = symulacjaReader.build();
        //tu mamy wczytane i zaczynamy zabawę

        //tu kkoniec zabawy i dalej tylko wypisujemy
        SymulacjaOut out = new SymulacjaOut(symulacja);
        String json = jsonAdapter.indent("  ").toJson(out);


        WriteToFile.write(json, CreateFile.create("out/wynik.out.json"));

    }
}
