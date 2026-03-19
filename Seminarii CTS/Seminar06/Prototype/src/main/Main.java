package main;

import clase.Rezervare;
import clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        RezervareAbstracta rez1=new Rezervare("Gica", 20, 12, "07");
        RezervareAbstracta rez2=rez1.clone();

        ((Rezervare) rez2).setOraRezervare(20);
        ((Rezervare) rez2).setZiuaRezervarii(10);
        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}