package day36_Inheritance.employeeTask;

public class Teacher extends Employee {

    public void teach() {
        System.out.println(name + " is teaching");
    }

    public void lecture() {
        System.out.println(name + " giving a lecture");
    }
}
