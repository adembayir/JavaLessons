package day38_Inheritance.shapesTask;

public class Square extends Shape{
    public double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double area() {
        return side*side;
    }

    public double perimeter() {
        return 4*side;
    }

    public String toString() {
        return "Square{" +
                "name=" + name +
                ", side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Square
	s

	toString(): name, s, area, perimeter
 */
