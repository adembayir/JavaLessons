package day43_Abstraction.car;

public class carShop {

    public static void main(String[] args) {

        Honda honda1 = new Honda("Accord", "Black", 2019, 30000);

        Audi audi1 = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla1 = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println(tesla1);

        System.out.println("==========================================================");

        honda1.setColor("Red");
        audi1.setColor("Pink");
        tesla1.setColor("Green");

        honda1.setPrice(25000);
        audi1.setPrice(40000);
        tesla1.setPrice(55000);

        System.out.println(honda1);
        System.out.println(audi1);
        System.out.println(tesla1);


    }
}
