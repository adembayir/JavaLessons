package day45_Abstraction.shape;

public class Pentagon extends Shape {

    private double side;
    private double apothem;

    public Pentagon (double side, double apothem) {
        setSide(side);
        setApothem(apothem);
    }

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side < 0) {
            throw new RuntimeException("Invalid side length: " + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return perimeter() * apothem / 2;
    }

    @Override
    public double perimeter() {
        return 5 * side;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                super.toString() +
                ", side=" + side +
                ", apothem=" + apothem +
                '}';
    }
}
