package ro.ase.cts.animals;

public class Zebra extends Animal {

    int numberOfStripes;

    public Zebra(String name, int age, FoodType foodType, int numberOfStripes) {
        super(name, age, foodType);
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Zookeperul "+zooKeeperName+" feeds zebra"+ super.name+" with"+super.foodType);

    }
}
