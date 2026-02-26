package ro.ase.cts.main;


import ro.ase.cts.animals.FoodType;
import ro.ase.cts.animals.Lion;
import ro.ase.cts.animals.Maimuta;
import ro.ase.cts.animals.Zebra;
import ro.ase.cts.zoo.ZOO;
import ro.ase.cts.zoo.Zookeeper;

public class Main {
    public static void main(String[] args) {
        ZOO zoo=new ZOO("ZOO BANEASA", new Zookeeper("Ionescu"));
        Lion lion=new Lion("Leon", 5, FoodType.MEAT, 65);
        zoo.addAninmal(lion);
        zoo.addAninmal(new Zebra("Zeta", 4, FoodType.GRASS, 150));
        zoo.addAninmal(new Maimuta("Mara", 4, FoodType.BANANAS));
        zoo.feedAllAnimals();
    }
}