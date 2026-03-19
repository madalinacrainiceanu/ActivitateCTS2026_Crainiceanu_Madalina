package fabrici;

import clase.FelMancare;
import clase.Supa;
import clase.SupaCiuperci;
import clase.SupaLegume;
import enums.TipMancare;
import enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta{
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        if(tipMancare== TipSupa.LEGUME){
            return new SupaLegume(pret, gramaj);
        }else if(tipMancare==TipSupa.CIUPERCI){
            return  new SupaCiuperci(pret, gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return getFelMancare(tipMancare, pret, gramaj);
    }
}
