package com.company;

import java.util.Arrays;

/**
 * Created by user on 2016-02-28.
 */
public class Zamowienie {
    Pozycja[] pozycje;
    private int ileDodanych;
    private int maksRozmiar;

    public Zamowienie() {
        pozycje = new Pozycja[maksRozmiar];
        ileDodanych = 0;
        maksRozmiar = 10;
    }

    public Zamowienie(int maksRozmiar) {
        pozycje = new Pozycja[maksRozmiar];
        ileDodanych = 0;
        this.maksRozmiar = maksRozmiar;
    }

    public void dodajPozycje(Pozycja p){
        if(ileDodanych>=maksRozmiar){
            System.out.println("Limit pozycji wykorzystany.");
        }
        else{
            pozycje[ileDodanych] = new Pozycja(p.nazwaTowaru, p.ileSztuk, p.cena);
        }
        ileDodanych++;
    }
    public double obliczWartosc(){
        double wartosc=0;
        for(int i = 0; i < ileDodanych; i++)
        {
            wartosc += pozycje[i].obliczWartosc();
        }
        return wartosc;
    }

    @Override
    public String toString() {
        String str = "\nZamówienie:\n";
        for(int i = 0; i < ileDodanych; i++)
        {
            str += pozycje[i] + "\n";
        }
        str += "\nRazem: " + obliczWartosc() + " zł";
        return str;
    }
}
