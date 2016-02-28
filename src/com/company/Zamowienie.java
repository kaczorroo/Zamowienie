package com.company;

import java.util.Arrays;

/**
 * Created by user on 2016-02-28.
 */
public class Zamowienie {
    Pozycja[] pozycje;
    int ileDodanych;
    int maksRozmiar;

    public Zamowienie() {
    }

    public Zamowienie(int maksRozmiar) {
        this.maksRozmiar = maksRozmiar;
    }
    public void dodajPozycje(Pozycja p){
    }
    public double obliczWartosc(){
        double wartosc=0;
        return wartosc;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "pozycje=" + Arrays.toString(pozycje) +
                '}';
    }
}
