package main;

import clase.FelMancare;
import enums.TipDesert;
import enums.TipSupa;
import fabrici.FabricaDesert;
import fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {

        FabricaDesert fabricaDesert=new FabricaDesert();
        FabricaSupa fabricaSupa=new FabricaSupa();

        FelMancare supaCiuperci=fabricaSupa.getFelMancare(TipSupa.CIUPERCI,15.5f, 300.0f);
        FelMancare supaLegume=fabricaSupa.getFelMancare(TipSupa.LEGUME, 14.0f, 250.0f);
        FelMancare clatite=fabricaDesert.getFelMancare(TipDesert.CLATITE, 30.0f, 180.0f, 800);
        FelMancare papanasi=fabricaDesert.getFelMancare(TipDesert.PAPANASI, 37.0f, 190.0f, 600);

        supaCiuperci.afisare();
        supaLegume.afisare();
        clatite.afisare();
        papanasi.afisare();


    }
}