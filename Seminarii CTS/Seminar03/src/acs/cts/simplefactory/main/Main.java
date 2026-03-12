package acs.cts.simplefactory.main;

import acs.cts.simplefactory.clase.MijlocTransport;
import acs.cts.simplefactory.factory.Depou;
import acs.cts.simplefactory.factory.Tipuri;

public class Main {
     public static void main(String[] args) {
         Depou depou=new Depou();
         MijlocTransport autobuz=depou.getMijlocTransport(Tipuri.AUTOBUZ, 4,"B149ABC");
         MijlocTransport tramvai=depou.getMijlocTransport(Tipuri.TRAMVAI, 20, "B888AAA");

         autobuz.afisareDescriere();
         tramvai.afisareDescriere();
    }
}
