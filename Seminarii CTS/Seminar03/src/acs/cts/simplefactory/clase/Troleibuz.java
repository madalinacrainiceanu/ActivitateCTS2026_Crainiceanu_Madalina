package acs.cts.simplefactory.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append(" Troleibuz  are: Numar roti: ").append(super.numarRoti);
        sb.append("Numar inmat: ").append(super.numarInmatriculare);
        System.out.println(sb.toString());
    }
}
