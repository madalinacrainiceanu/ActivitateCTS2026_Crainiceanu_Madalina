package ro.ase.cts.zoo;

import ro.ase.cts.animals.Animal;

public class Zookeeper {
    private String name;
    public Zookeeper(String name){
        this.name=name;
    }
    public void feedAnimal(Animal animal) {
        animal.eat(this.name);
    }
}
