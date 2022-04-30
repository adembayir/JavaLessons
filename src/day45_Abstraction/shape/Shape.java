package day45_Abstraction.shape;

public abstract class Shape {

    private final String name;

    public Shape () {
        name = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public abstract double area ();

    public abstract double perimeter();

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
