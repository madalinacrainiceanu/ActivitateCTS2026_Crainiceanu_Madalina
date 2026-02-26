package ro.ase.cts.zoo;

import ro.ase.cts.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private  String name;
    private Zookeeper zooKeeper;
    private List<Animal> animals;

    public ZOO(String name,Zookeeper zooKeeper ){
        this.name=name;
        this.zooKeeper=zooKeeper;
        this.animals=new ArrayList<>();

    }
    public void addAninmal(Animal animal){
        this.animals.add(animal);
    }
    public void feedAllAnimals(){
        for(Animal animal: animals){
            this.zooKeeper.feedAnimal(animal);
        }
    }


}
