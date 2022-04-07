package day31_Constructors;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        int totalCost = 0;


        if ( size == 'S'){
            totalCost = 10 + ((numberOfCheeseTopping+numberOfPepperoniTopping)*2);
        } else if ( size == 'M'){
            totalCost = 12 + ((numberOfCheeseTopping+numberOfPepperoniTopping)*2);
        } else if ( size == 'L'){
            totalCost = 14 + ((numberOfCheeseTopping+numberOfPepperoniTopping)*2);
        } else {
            System.out.println("Invalid size.");
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total price of pizza =" + calcCost() +
                '}';
    }
}
/*
Pizza Task:
    	Attributes:
    		size, numberofCheeseTopping, numberOfPepperoniTopping

    		Add a constructor that can set all the fields

		Actions:
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */