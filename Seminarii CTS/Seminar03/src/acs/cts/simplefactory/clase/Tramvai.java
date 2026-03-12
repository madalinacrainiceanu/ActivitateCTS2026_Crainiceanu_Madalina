package acs.cts.simplefactory.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(int numarRoti, String numarInmatriculare) {
        super(numarRoti, numarInmatriculare);
    }

    @Override
    public void afisareDescriere() {
        StringBuilder sb=new StringBuilder();
        sb.append(" Tramvaiul  are: Numar roti: ").append(super.numarRoti);
        sb.append("Numar inmat: ").append(super.numarInmatriculare);
        System.out.println(sb.toString());
    }
}
