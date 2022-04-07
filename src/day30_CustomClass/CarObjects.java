package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Peugeot", "5008","White",2011, 155000);

        Car car2 = new Car();

        car2.setInfo("Audi", "A6", "Black", 2010,450000);

        Car car3 = new Car();

        car3.setInfo("BMW", "X5", "Red", 2022, 5000000);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);

    //  Car[] cars = {car1, car2, car3};

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1, car2, car3));

        for (Car each : carList){
            System.out.println(each.brand + " : "+ each.price);
        }

        System.out.println("=========================================================");

        /*
        BMW : 2005 ~ 2008
        Peugeot: 1995 ~ 1997 eligible for recall
         */

        carList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carList.removeIf( p -> p.equals("Peugeot") && p.year >= 1995 && p.year <= 1997);





    }
}
