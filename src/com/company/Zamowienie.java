package com.company;

/**
 * Created by user on 2016-02-28.
 */
public class Zamowienie {
    public static void main(String[]args) {
        Pozycja pozycja1 = new Pozycja("Mąka", 25, 3);
        System.out.println(pozycja1);
        Pozycja pozycja2 = new Pozycja("Woda", 10, 2.5);
        System.out.println(pozycja2);
        Pozycja pozycja3 = new Pozycja("Mleko", 100, 4.25);
        System.out.println(pozycja3);
        int ileDanych = 0;
        int maksRozmiar = 1;
    }
}
