package day36_Inheritance.employeeTask;

public class Driver extends Employee {

    public String plateNumber;

    public void drive() {
        System.out.println(name + " is driving");
    }
    public void carWash() {
        System.out.println(name + " is washing car.");
    }
}
