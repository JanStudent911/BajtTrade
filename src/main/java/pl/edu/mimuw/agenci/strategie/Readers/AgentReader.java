package pl.edu.mimuw.agenci.strategie.Readers;

import com.squareup.moshi.Json;

public abstract class AgentReader {
    protected int id;
    @Json(name = "zasoby") protected ZasobyReader zasobyReader;

}
