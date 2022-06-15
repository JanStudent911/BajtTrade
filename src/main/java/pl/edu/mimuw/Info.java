package pl.edu.mimuw;

import com.squareup.moshi.Json;

public class Info {
    private int dlugosc;
    private String gielda;
    private int x;
    @Json(name = "kara_za_brak_ubrań")
    private int kara_za_brak_ubran;
    private Ceny ceny;

    private transient int dzienSymulacji;

    public Info() {
        dzienSymulacji = 0;
    }

    public int getDzien() {
        return dzienSymulacji;
    }
    public void nowyDzien(){
        dzienSymulacji++;
    }


    public String toString() {
        return "Długość: "+dlugosc+"\nGiełda: "+gielda+"\nx: "+x+"\nCeny:\n{\n"+ceny.toString()+"}";
    }
}
