package fabrici;

import clase.FelMancare;
import enums.TipMancare;

public interface FabricaAbstracta {
    //mai multe tipuri de atribute: 2 si 3->2metode
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);

}
