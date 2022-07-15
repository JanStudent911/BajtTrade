package pl.edu.mimuw.produkty;

public class JedzeniePaczka extends Produkt{
    private int ilosc;

    public JedzeniePaczka(int ilosc) {
        this.ilosc = ilosc;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void dodaj(int i){
        ilosc += i;
    }

    public void zjedz(int i){
        ilosc -= i;
    }
}
