package Adapter.main;

import Adapter.clase.farmacie.Medicament;
import Adapter.clase.adapter.Adaptor;

public class main {

    public static void procurareMedicament(Medicament medFarmacie)
    {
        medFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        Adapter.clase.spital.Medicament medSpital = new Adapter.clase.spital.Medicament("nurofen forte",25.0f);
        Medicament medFarma = new Medicament("medtest");

        //procurareMedicament(medSpital);
        procurareMedicament(medFarma);
        Adaptor adaptorDinSpital = new Adaptor(medSpital);
        procurareMedicament(adaptorDinSpital);
    }
}
