package day44_Abstraction.animalTask;

public final class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println(getName() + " is eating cat food.");
    }

    public void meow() {
        System.out.println(getName() + "is meowing.");
    }
}
