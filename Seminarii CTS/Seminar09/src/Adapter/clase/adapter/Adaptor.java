package Adapter.clase.adapter;

import Adapter.clase.farmacie.Medicament;

public class Adaptor extends Medicament {
    private Adapter.clase.spital.Medicament medSpital;

    public Adaptor(Adapter.clase.spital.Medicament medSpital) {
        super(medSpital.getNume());
        this.medSpital = medSpital;
    }

    @Override
    public void cumparaMedicament()
    {
       medSpital.achizitioneazaMedicament();
    }
}
