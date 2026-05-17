package Observer.ro.ase.cts.clase;

public class Autobuz extends MijlocDeTransport{
    public Autobuz(String nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj="Autobuzul de pe linia "+super.nrLinie+" a plecat din depou";
        notificareCalatori(mesaj);
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj="Autobuzul de pe linia "+super.nrLinie+" e blocat in trafic";
        notificareCalatori(mesaj);
    }
}
