package Facade.clase;

public class Medic {
    public boolean areTrimitere(Pacient pacient){
        return pacient.getGravitate()>5;
    }
}
