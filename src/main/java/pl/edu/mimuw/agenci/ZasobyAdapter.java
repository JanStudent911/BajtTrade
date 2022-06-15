package pl.edu.mimuw.agenci;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import pl.edu.mimuw.agenci.strategie.Readers.ZasobyReader;

public class ZasobyAdapter {

//    public ZasobyAdapter(Zasoby zasoby){
//
//    }
//


    @ToJson
    String toJson(Zasoby zasoby){
        StringBuilder sb = new StringBuilder();
        sb.append("{").append("\n")
                .append("diamenty: " + zasoby.diamenty + ", ")
                .append("ubrania: " + zasoby.ubrania.size() + ", ")
                .append("narzedzia: " + zasoby.narzedzia.size()+ ", ")
                .append("jedzenie: " + zasoby.jedzenie + ", ")
                .append("programy: " + zasoby.programy.size() + ", ");

        return sb.toString();
    }
//    @FromJson
//    ZasobyReader dupa(){
//        return null;
//    }

}
