package pl.edu.mimuw;

import com.squareup.moshi.Json;

public class Info {
    public int getDlugosc() {
        return dlugosc;
    }

    private int dlugosc;



    private String gielda;
    private transient int x;
    @Json(name = "kara_za_brak_ubrań")
    private int kara_za_brak_ubran;
    private Ceny ceny;

    private transient int dzienSymulacji;



    public Info() {
        dzienSymulacji = 0;
    }

    public String getGielda() {
        return gielda;
    }
    public int getDzien() {
        return dzienSymulacji;
    }
    public Ceny getCeny() {
        return ceny;
    }

    public void nowyDzien(){
        dzienSymulacji++;
    }

}
