package pl.edu.mimuw.agenci.strategie.Readers;

import pl.edu.mimuw.agenci.Zasoby;

public class ZasobyOut extends ZasobyReader{

    public ZasobyOut(Zasoby zasoby){
        diamenty = zasoby.getDiamenty();
        jedzenie = zasoby.getJedzenie();
        ubrania = zasoby.getUbrania().size();
        narzedzia = zasoby.getNarzedzia().size();
        programy = zasoby.getProgramy().size();
    }

    @Override
    public Zasoby build() {
        return super.build();
    }
}
