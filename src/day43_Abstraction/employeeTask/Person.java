package day43_Abstraction.employeeTask;

import java.util.InputMismatchException;

public abstract class Person {

    private String name;
    private int age;
    private char gender;

    public Person (String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 130) {
            throw new InputMismatchException("Invalid age: " + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            throw new InputMismatchException("Invalid gender!");
        }
        this.gender = gender;
    }

    public abstract void sleep();

    public void eat() {
        System.out.println(getName() + " is eating baklava");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
