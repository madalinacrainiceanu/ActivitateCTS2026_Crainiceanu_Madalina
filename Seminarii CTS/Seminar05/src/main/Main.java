package main;

import Builder.Internare;
import Builder.InternareAltBuilder;
import Builder.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare(true,false,true,true,"Mihai popescu");
        Internare internare1 = new Internare(false,false,false,false,"Ana Maria");

        InternareBuilder builder=new InternareBuilder("Ana Pop");
        Internare internare2 = builder.build();

        Internare internare3 = builder.setNume("AndreI Matei").setPat(true).setPapuci(true).setHalat(true).build();

        System.out.println(internare2.toString());
        System.out.println(internare3.toString());

        InternareAltBuilder builderAlt = new InternareAltBuilder();
        builderAlt.setMicDejun(true);
        Internare internare101 = builderAlt.build("Georgescu Ion");
        Internare internare102 = builderAlt.build("Petre Maria");
        Internare internare103 = builderAlt.build("Nicolae Geta");

        internare101.setNumePacient("Popescu Ionel");
        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());

    }
}
