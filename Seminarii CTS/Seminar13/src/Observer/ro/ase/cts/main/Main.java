package Observer.ro.ase.cts.main;

import Observer.ro.ase.cts.clase.Autobuz;
import Observer.ro.ase.cts.clase.CalatorAbonat;
import Observer.ro.ase.cts.clase.CalatorObserver;
import Observer.ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        CalatorObserver calator1=new CalatorAbonat("Cristina");
        CalatorObserver calator2=new CalatorAbonat("Irina");
        CalatorObserver calator3=new CalatorAbonat("Marina");
        CalatorObserver calator4=new CalatorAbonat("Sabina");

        MijlocDeTransport autobuz=new Autobuz("226");
        autobuz.abonareCalator(calator1);
        autobuz.abonareCalator(calator2);
        autobuz.abonareCalator(calator3);

        autobuz.pleacaDinDepou();
        autobuz.abonareCalator(calator4);
        autobuz.ramaneBlocatInTrafic();
    }
}
