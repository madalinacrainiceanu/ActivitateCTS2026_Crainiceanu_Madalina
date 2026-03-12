package acs.cts.singleton;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int numarCamereOcupate;
    private static Hotel instance=null;

    private Hotel(String numeHotel, int numarCamere, int numatCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numatCamereOcupate;
    }
    public static synchronized Hotel getInstance(String numeHotel, int numarCamere, int numarCamereOcupate){
        if(instance==null){
            //doar pentru hotel1 intra ca null , apoi la hotel 2 da return direct
            instance=new Hotel(numeHotel, numarCamere,numarCamereOcupate);
        }
        return instance;
    }
    //versiune de lazy initialization
    //thread safe -> syncronized, cea mai usoara forma de a face asa

    //sa afiseze ca s a ocupat si sa creasca nr cam oc, in cond in care mai am camere libere

    public void rezervaCamera(){
        if(this.numarCamereOcupate<this.numarCamere){
            System.out.println("Rezervarea a fost realizata");
            numarCamereOcupate++;

        }else{
            System.out.println("Nu mai exista camere disponibile");
        }
    }

    public void afisareDetaliiHotel(){
        StringBuilder builder=new StringBuilder();
        builder.append(this.numeHotel).append(this.numarCamere).append(this.numarCamereOcupate);
        System.out.println(builder);
    }

}
