package pl.edu.mimuw.agenci.strategie.Adapters;

import pl.edu.mimuw.agenci.Zasoby;

public class ZasobyOut extends ZasobyReader{

    public ZasobyOut(Zasoby zasoby){
        diamenty = zasoby.getDiamenty();
        jedzenie = zasoby.getJedzenie().getIlosc();
        ubrania = zasoby.getUbrania().size();
        narzedzia = zasoby.getNarzedzia().size();
        programy = zasoby.getProgramy().size();
    }

    @Override
    public Zasoby build() {
        return super.build();
    }
}
