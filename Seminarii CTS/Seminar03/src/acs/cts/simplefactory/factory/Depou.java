package acs.cts.simplefactory.factory;

import acs.cts.simplefactory.clase.Autobuz;
import acs.cts.simplefactory.clase.MijlocTransport;
import acs.cts.simplefactory.clase.Tramvai;
import acs.cts.simplefactory.clase.Troleibuz;

public class Depou {
    public MijlocTransport getMijlocTransport(Tipuri tip, int numarRoti, String numarInmatriculare){
        if(tip==Tipuri.AUTOBUZ){
            return new Autobuz(numarRoti,numarInmatriculare);
        }
        else if(tip==Tipuri.TRAMVAI){
            return new Tramvai(numarRoti,numarInmatriculare);
        }
        else if (tip==Tipuri.TROLEIBUZ){
            return new Troleibuz(numarRoti,numarInmatriculare);
        }else{
            return null;
        }
    }
}
