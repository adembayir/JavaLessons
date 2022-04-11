package day38_Inheritance.carTask;

public class BMW extends Car {
    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown() {
        System.out.println(model + " breaks down.");
    }

    public void racing() {
        System.out.println(model + " is racing.");
    }

}
