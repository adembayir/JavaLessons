package day39_Recap.shapesTask;

public class Circle extends Shape {
    private double radius;
    public static double pi;

    static {
        pi = 3.14;
    }

    public void setRadius(double radius) {
        if(radius <= 0 ) {
            System.err.println("Invalid value! : " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Circle extends Shape:
		variables:
			radius
			pi (static)

		Encapsulate the field

		Add a constructor to set the filed

		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter
 */
