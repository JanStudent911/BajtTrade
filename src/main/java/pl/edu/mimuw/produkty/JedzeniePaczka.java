package pl.edu.mimuw.produkty;

public class JedzeniePaczka extends Produkt{
    private int ilosc;

    public JedzeniePaczka(int ilosc) {
        this.ilosc = ilosc;
    }

    public int getIlosc() {
        return ilosc;
    }
}
