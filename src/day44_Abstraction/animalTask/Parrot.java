package day44_Abstraction.animalTask;

public class Parrot extends Animal implements Playable, Flyable {

    public Parrot (String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " eats chocolate.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with little ball");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " can fly at the speed of 13 km/h");
    }
}
