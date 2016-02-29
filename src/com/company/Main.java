package com.company;

/**
 * Created by user on 2016-02-28.
 */
public class Main {
    public static void main(String[]args){
        Pozycja p1 = new Pozycja("Chleb", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Cukier", 3, 4);
        System.out.println(p2);


        Zamowienie z = new Zamowienie(10);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);

        System.out.println(z.toString());
    }
}
