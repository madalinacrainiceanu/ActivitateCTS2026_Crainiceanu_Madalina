package Observer.ro.ase.cts.clase;

public class CalatorAbonat implements CalatorObserver{
    private String numeAbonat;

    @Override
    public void notificare(String nrLinie) {
        System.out.println("Calatorul "+this.numeAbonat+", autobuzul de pe linia "+nrLinie+" a plecat din statie");
    }

    public CalatorAbonat(String numeAbonat) {
        this.numeAbonat = numeAbonat;
    }
}
