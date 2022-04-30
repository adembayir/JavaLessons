package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{

    private double radius;
    private double height;
    public final static double pi;

    public Cylinder (double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }

    static {
        pi = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new RuntimeException("Invalid radius: " + radius);
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0) {
            throw new RuntimeException("Invalid height: " + height);
        }
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * pi * radius * (radius + height);
    }

    @Override
    public double perimeter() {
        return (4 * radius) + (2 * height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                ", radius=" + radius +
                ", height=" + height +
                '}';
    }

    @Override
    public double volume() {
        return pi * radius * 2 * height;
    }
}
