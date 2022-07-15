package pl.edu.mimuw.agenci;


import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.Symulacja;
import pl.edu.mimuw.produkty.Produkty;

public abstract class Agent {
    protected int id;
    protected Zasoby zasoby;

    protected transient Symulacja mojaSymulacja;

    public void setMojaSymulacja(Symulacja mojaSymulacja) {
        this.mojaSymulacja = mojaSymulacja;
    }

    public Symulacja getMojaSymulacja() {
        return mojaSymulacja;
    }

    public int getId() {
        return id;
    }

    public Zasoby getZasoby() {
        return zasoby;
    }

    public Agent(int id, Zasoby zasoby){
        this.id = id;
        this.zasoby = zasoby;
    }

    public void wezPrzedmiotyZOferty(Oferta oferta, int i){
        switch (oferta.getRodzaj_produktu()){
            case DIAMENTY:
                zasoby.dostanDiamenty(oferta.getIlosc());
                break;
            case JEDZENIE:
                zasoby.dostanJedzenie(oferta.getIlosc());
                break;
            case UBRANIA:
                zasoby.dostanProdukty(Produkty.UBRANIA, oferta.getObiekty(i));
                break;
            case NARZEDZIA:
                zasoby.dostanProdukty(Produkty.NARZEDZIA, oferta.getObiekty(i));
                break;
            case PROGRAMY:
                zasoby.dostanProdukty(Produkty.PROGRAMY, oferta.getObiekty(i));
                break;
        }
    }
}
