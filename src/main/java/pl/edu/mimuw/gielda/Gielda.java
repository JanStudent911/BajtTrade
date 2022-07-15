package pl.edu.mimuw.gielda;

import pl.edu.mimuw.Oferta;
import pl.edu.mimuw.OfertaSpekulanta;
import pl.edu.mimuw.Symulacja;
import pl.edu.mimuw.agenci.Robotnik;
import pl.edu.mimuw.agenci.spekulant.Spekulant;
import pl.edu.mimuw.produkty.Produkty;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import static java.lang.Math.max;

public abstract class Gielda implements IGielda{
    protected List<Robotnik> robotnicyNaGieldzie;
    private List<OfertaSpekulanta> ofertyKupnaSpekulantow;
    private List<OfertaSpekulanta> ofertySprzedazySpekulantow;
    private List<HistoriaCenDnia> historiaCen;
    private Symulacja mojaSymulacja;

    public Gielda() {
        ofertyKupnaSpekulantow = new ArrayList<OfertaSpekulanta>();
        ofertySprzedazySpekulantow = new ArrayList<OfertaSpekulanta>();
        historiaCen = new ArrayList<HistoriaCenDnia>();
    }


    public void setRobotnicyNaGieldzie(List<Robotnik> robotnicyNaGieldzie) {
        this.robotnicyNaGieldzie = robotnicyNaGieldzie;
    }

    public void setMojaSymulacja(Symulacja mojaSymulacja) {
        this.mojaSymulacja = mojaSymulacja;
        ustawCenyDniaZero();
    }

    private void ustawCenyDniaZero() {
        historiaCen.add(new HistoriaCenDnia(0));
        for (Produkty p : Produkty.values()) {
            if(p != Produkty.DIAMENTY) {
                historiaCen.get(0).notuj(p, mojaSymulacja.info.getCeny().getCena(p), 1);
            }
        }

    }

    public double policzSredniaZIleDni(Produkty p, int ileDni){
        int dni = mojaSymulacja.info.getDzien() - 1;//tyle dni historii mamy
        double srednia = 0;
        for(int i = 0; i < ileDni; i++){
            srednia += getCenaHistoryczna(TypStat.SR_ARYT,p, max(dni-i, 0));
        }
        return srednia/ileDni;
    }

    public double getCenaHistoryczna(TypStat typ, Produkty p, int dzien){
        double odp;
        assert(historiaCen != null);
        switch (typ){

            case MAX:
                odp = historiaCen.get(dzien).getMax().getCenaProduktu(p);
                break;
            case MIN:
                odp = historiaCen.get(dzien).getMin().getCenaProduktu(p);
                break;
            case SR_ARYT:
                odp = historiaCen.get(dzien).getSr().getCenaProduktu(p);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typ);
        }
        return odp;
    }


    public void przyjmijOferty(Spekulant s){
        ofertyKupnaSpekulantow.addAll(s.budujOferteKupna());
        ofertySprzedazySpekulantow.addAll(s.budujOferteSprzedazy());
    }

    private void porzadkujOferty(){
        //todo - osobne listy dla kategorii przedmiotów?
        ofertyKupnaSpekulantow.sort(Comparator.comparing(OfertaSpekulanta::getRodzaj_produktu).thenComparing(OfertaSpekulanta::getCena));
        ofertySprzedazySpekulantow.sort(Comparator.comparing(OfertaSpekulanta::getRodzaj_produktu).thenComparing(OfertaSpekulanta::getCena).reversed());
    }

    private void robotnikSprzedaje(Robotnik aktywnyR){
        Oferta ofertaSpRobotnika = aktywnyR.getNowo_wyprodukowane();
        double suma = 0;
        Iterator<OfertaSpekulanta> iter = ofertyKupnaSpekulantow.iterator();

        while(ofertaSpRobotnika.getIlosc() > 0 && iter.hasNext()){


            OfertaSpekulanta ofertaKupSpekulanta = iter.next();//już posortowane po atrakcyjnosci
            while(ofertaKupSpekulanta.getRodzaj_produktu() != ofertaSpRobotnika.getRodzaj_produktu()){
                if(iter.hasNext()){
                    ofertaKupSpekulanta = iter.next();
                }else{
                    //nie ma juz ofert dla robotnika
                }
            }//teraz jesteśmy na pierwszym (atrakcyjnym) elemencie danego produktu;

            if(ofertaSpRobotnika.getIlosc() >= ofertaKupSpekulanta.getIlosc()){
                //liczenie kosztu
                suma = ofertaKupSpekulanta.getIlosc() * ofertaKupSpekulanta.getCena();
                //obciazanie spekulanta kosztem
                ofertaKupSpekulanta.getMojAgent().getZasoby().zaplacDiamenty(suma);
                //dodawanie robotnikowi diamentów
                aktywnyR.getZasoby().dostanDiamenty(suma);
                suma = 0;
                //spekulant dostaje przedmioty
                ofertaKupSpekulanta.getMojAgent().wezPrzedmiotyZOferty(ofertaSpRobotnika, ofertaKupSpekulanta.getIlosc());
                //aktualizowanie oferty robotnika
                //ofertaSpRobotnika.zabierzSztuki(ofertaKupSpekulanta.getIlosc()); automatycznie w wezPrzedmioty
                historiaCen.get(mojaSymulacja.info.getDzien()).notuj(ofertaSpRobotnika.getRodzaj_produktu(),
                        ofertaKupSpekulanta.getCena(), ofertaKupSpekulanta.getIlosc());
                //kasowanie oferty spekulanta
                iter.remove();
            }else{
                //liczenie kosztu
                suma = ofertaSpRobotnika.getIlosc() * ofertaKupSpekulanta.getCena();


            }

        }
    }




    public void realizujTransakcje(){
        porzadkujOferty();//najbardziej atrakcyjne oferty na poczatku

        Robotnik aktywnyR = wskazNastRobotnika();
        robotnikSprzedaje(aktywnyR);

    }
}

