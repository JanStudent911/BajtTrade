package pl.edu.mimuw.agenci;

import com.squareup.moshi.Json;

public enum KarieraRobotnika {
    @Json(name = "rolnik")ROLNIK,
    @Json(name = "rzemieslnik")RZEMIESLNIK,
    @Json(name = "inzynier")INZYNIER,
    @Json(name = "gornik")GORNIK,
    @Json(name = "programista")PROGRAMISTA
}//zamiast tego enuma chciałem zrobić osobne klasy dla kazdej kariery
 //które przechowywałyby swoje produkty...
 //ale kolega tak doradził to robię tak (z enumem)
