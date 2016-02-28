package com.company;

/**
 * Created by user on 2016-02-28.
 */
public class Pozycja {
    private String nazwaTowaru;
    private int ileSztuk;
    private double cena;

    public Pozycja(String nazwaTowaru, int ileSztuk, double cena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }
    public double obliczWartosc(){
        return cena*ileSztuk;
    }

    @Override
    public String toString() {
        String lancuch = String.format("%s%20s%2s%4s%2s%10s%2s",nazwaTowaru,cena,"zl",ileSztuk,"szt.",cena*ileSztuk,"zl");
        return lancuch;
    }
}
