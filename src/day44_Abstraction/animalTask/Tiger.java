package day44_Abstraction.animalTask;

public class Tiger extends Animal implements Wild{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " eats deer.");
    }

    public void roar() {
        System.out.println(getName() + " is roaring.");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " hunts deer");
    }
}
