package Builder;

public class InternareAltBuilder implements InternareBuilderAbstractAlt{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public InternareAltBuilder() {
        this.papuci = false;
        this.halat = false;
        this.micDejun = false;
        this.patRabatabil = false;
    }

    public InternareAltBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public InternareAltBuilder setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public InternareAltBuilder setPapuci(boolean papuci) {
        this.papuci = papuci;
        return this;
    }

    public InternareAltBuilder setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }

    @Override
    public Internare build(String nume) {
        Internare internare = new Internare(this.patRabatabil,this.micDejun,this.papuci,this.halat,nume);
        return internare;
    }
}
