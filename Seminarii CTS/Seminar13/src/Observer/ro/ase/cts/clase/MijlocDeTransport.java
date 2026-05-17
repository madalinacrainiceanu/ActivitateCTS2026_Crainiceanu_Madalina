package Observer.ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    protected List<CalatorObserver> calatori;
    protected String nrLinie;

    public MijlocDeTransport(String nrLinie) {
        this.nrLinie=nrLinie;
        this.calatori=new ArrayList<>();
    }

    public void abonareCalator(CalatorObserver calator){
        calatori.add(calator);
    }

    public void dezabonareCalator(CalatorObserver calator){
        calatori.remove(calator);
    }

    public void notificareCalatori(String mesaj){
        for(CalatorObserver calator:this.calatori){
            calator.notificare(mesaj);
        }
    }

    public abstract void pleacaDinDepou();

    public abstract void ramaneBlocatInTrafic();
}
