package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 123456);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw = new BMW("X5", 2021, 45000, "Black", 2700);

        toyota.start();
        tesla.start();
        bmw.start();
    }
}
