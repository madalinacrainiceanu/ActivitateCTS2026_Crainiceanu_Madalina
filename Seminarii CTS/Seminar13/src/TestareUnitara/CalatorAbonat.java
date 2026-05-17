package TestareUnitara;

import Observer.ro.ase.cts.clase.CalatorObserver;

public class CalatorAbonat implements CalatorObserver {
    private String numeAbonat;
    private float sold;

    public float getSold() {
        return sold;
    }

    public CalatorAbonat setSold(float sold) {
        this.sold = sold;
        return this;
    }

    public void platesteBilet(float pret){
        if(sold>pret){
            System.out.println(this.numeAbonat+" plateste "+pret+" pt bilet");
            sold-=pret;
        }else{
            System.out.println("Sold insuficient");
        }
    }

    @Override
    public void notificare(String nrLinie) {
        System.out.println("Calatorul "+this.numeAbonat+", autobuzul de pe linia "+nrLinie+" a plecat din statie");
    }

    public CalatorAbonat(String numeAbonat) {
        this.numeAbonat = numeAbonat;
    }
}

