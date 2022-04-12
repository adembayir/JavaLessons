package day38_Inheritance.shapesTask;

public class Circle extends Shape {

    public double radius;
    public static double pi;

    static {
        pi = 3.14;
    }


    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double area() {
        return pi*radius*radius;
    }

    public double perimeter() {
        return 2*pi*radius;
    }

    public String toString() {
        return "Circle{" +
                "name=" + name +
                ", radius=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Circle
	r
	pi

	toString(): name, r, pi, area, perimeter
 */