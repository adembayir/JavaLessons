package day35_Encapsulation.encapsulation;

public class Circle {

    private double radius;
    public static double pi;

    static {
        pi = 3.14;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Radius of the circle can not be zero or negative");
            return;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calcArea() {
        return pi*radius*radius;
    }

    public double calcPerimeter() {
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
/*
2. Create a class named Circle

			private variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the radius of circle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
 */