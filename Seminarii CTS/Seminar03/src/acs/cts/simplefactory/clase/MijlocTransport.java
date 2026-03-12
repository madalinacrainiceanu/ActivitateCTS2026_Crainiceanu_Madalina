package acs.cts.simplefactory.clase;

public abstract class MijlocTransport {
    protected int numarRoti;
    protected String numarInmatriculare;

    public MijlocTransport(int numarRoti, String numarInmatriculare) {
        this.numarRoti = numarRoti;
        this.numarInmatriculare = numarInmatriculare;
    }

    //in caz ca nunni se cere, implementam cea mai usoara functionalitate
    public abstract void afisareDescriere();

}
