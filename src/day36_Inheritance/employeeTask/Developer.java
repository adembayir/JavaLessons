package day36_Inheritance.employeeTask;

public class Developer extends Employee {

    public void code() {
        System.out.println(name + " is coding");
    }

    public void unitTesting() {
        System.out.println(name + " is doing unit testing");
    }

    public void integrationTesting() {
        System.out.println(name + " is doing integration testing");
    }
}
