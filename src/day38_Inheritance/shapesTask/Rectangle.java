package day38_Inheritance.shapesTask;

public class Rectangle extends Shape {
    public double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length*width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle{" +
                "name =" + name +
                ", length =" + length +
                ", width =" + width +
                ", area =" + area() +
                ", perimeter =" + perimeter() +
                '}';
    }
}
/*
Rectangle
	l
	w

	toString(): name, l, w, area, perimeter
 */