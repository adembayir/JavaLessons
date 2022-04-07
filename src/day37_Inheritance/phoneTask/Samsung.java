package day37_Inheritance.phoneTask;

public class Samsung extends Phone{

    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze() {
        System.out.println(brand+ " " + model + " is frozen, needs to be restarted");
    }
}
/*
1.3 Create a sub class of Phone named Samsung:
				Variables:
					brand, model, size, price, color

                Add a constructor

				Methods:

					call(long phoneNumber)
					text(long phoneNumber)
					freeze()
					toString()
 */
