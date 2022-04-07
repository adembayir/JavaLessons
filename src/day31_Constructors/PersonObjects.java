package day31_Constructors;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Adem", 'M',33);

        Person person2 = new Person("Neriman Eda", 'F', 33);

        person2.age = 28;

        System.out.println(person1);
        System.out.println(person2);
    }
}
