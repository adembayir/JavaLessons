package day39_Recap.shapesTask;

public class Shape {

    private String name;

    public Shape(String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("Name can not be null");
            System.exit(1); // 1: something went wrong
        }
        if (name.isBlank() || name.isEmpty()) {
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }
}
/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}
 */