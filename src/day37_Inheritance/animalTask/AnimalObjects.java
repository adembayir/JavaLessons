package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Karabas", "Sivas Kangalı", 'M', 3, "Large", "Brown");

        System.out.println(dog1);

        dog1.bark();

        System.out.println("=============================================================================");


        Cat cat1 = new Cat("Sakiz", "Tekir", 'F', 1, "Small", "White");

        System.out.println(cat1);

        cat1.scratch();

        System.out.println("=============================================================================");


        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 2, "Medium", "Multi-color");

        System.out.println(parrot1);

        parrot1.sing();
    }
}
