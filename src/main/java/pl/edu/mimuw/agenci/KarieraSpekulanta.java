package pl.edu.mimuw.agenci;

import com.squareup.moshi.Json;

public enum KarieraSpekulanta {
    @Json(name = "sredni")SREDNI,
    @Json(name = "wypukly")WYPUKLY,
    @Json(name = "regulujacy")REGULUJACY
}
