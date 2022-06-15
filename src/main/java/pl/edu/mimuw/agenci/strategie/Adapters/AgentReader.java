package pl.edu.mimuw.agenci.strategie.Adapters;

import com.squareup.moshi.Json;

public abstract class AgentReader {
    protected int id;
    @Json(name = "zasoby") protected ZasobyReader zasobyReader;

}
