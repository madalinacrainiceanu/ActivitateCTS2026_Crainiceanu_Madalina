package Decorator.src.ro.ase.cts.clase;

public class NotaDePlata implements NotaDePlataAbstract{
    private float pret;
    private String data;

    public NotaDePlata(float pret, String data) {
        super();
        this.pret = pret;
        this.data = data;
    }

    @Override
    public void printeazaNotaDePlata() {
        System.out.println("Nota de plata este de "+pret+" si este emisa pe data de "+data);
    }

    public float getPret() {
        return pret;
    }

    public NotaDePlata setPret(float pret) {
        this.pret = pret;
        return this;
    }

    public String getData() {
        return data;
    }

    public NotaDePlata setData(String data) {
        this.data = data;
        return this;
    }
}
