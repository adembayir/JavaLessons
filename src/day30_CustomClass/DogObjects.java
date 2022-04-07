package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();
        dog2.name = "Karabaş";
        dog2.breed = "Kangal";
        dog2.age = 3;
        dog2.gender = 'M';
        dog2.size = "Extra Large";
        dog2.color = "Beige";

        Dog dog3 = new Dog();
        dog3.setInfo("Jane", "German Shepard", 2, 'F',"Large", "Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Chico", "Chihuahua", 4, 'M', "Small","Brown");

        Dog dog5 = new Dog();
        dog5.setInfo("Yenn","Golden Retriever",3,'F',"Medium","Gold");



        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        System.out.println("=============================================================");

        Dog[] arr = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> maleDogs = new ArrayList<>();
        ArrayList<Dog> femaleDogs = new ArrayList<>();

        for (Dog each : arr) {
            if(each.gender == 'M'){
                maleDogs.add(each);
            } else {
                femaleDogs.add(each);
            }
        }

        System.out.println("maleDogs = " + maleDogs);
        System.out.println("femaleDogs = " + femaleDogs);
    }
}
