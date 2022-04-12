package day39_Recap.shapesTask;

import java.net.PortUnreachableException;

public class Square extends Shape {

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Side can not be zero or negative!");
            System.exit(0);
        }
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */
