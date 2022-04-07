package day36_Inheritance.employeeTask;

public class Tester extends Employee {

    public void smokeTesting() {
        System.out.println(name + " is doing smoke testing");
    }

    public void regressionTesting() {
        System.out.println(name + " is doing regression testing");
    }

    public void exploratoryTesting() {
        System.out.println(name + " is doing exploratory testing");
    }
}
