package day35_Encapsulation;

import java.sql.SQLOutput;

public class PersonObjects {

    public static void main(String[] args) {

    Person person1 = new Person("Mahmut", 24, 'M', "Turkish");



        person1.drink("Coke");

        person1.name = "Aliya Mahmut";

        System.out.println(Person.planet);
    }
}
