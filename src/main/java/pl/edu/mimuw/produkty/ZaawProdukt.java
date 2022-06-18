package pl.edu.mimuw.produkty;

import com.squareup.moshi.ToJson;

public abstract class ZaawProdukt extends Produkt {
    protected int poziom_jakosci;

    public ZaawProdukt(int poziom){
        poziom_jakosci = poziom;
    }
}
