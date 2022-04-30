package day45_Abstraction.shape;

public class Triangle extends Shape {

    private double lenA, lenB, lenC;

    public Triangle(double lenA, double lenB, double lenC) {
        setLenA(lenA);
        setLenB(lenB);
        setLenC(lenC);
    }

    public double s = (lenA + lenB + lenC) / 2;

    public double getLenA() {
        return lenA;
    }

    public void setLenA(double lenA) {
        if (lenA < 0) {
            throw new RuntimeException("Invalid length : " + lenA);
        }
        this.lenA = lenA;
    }

    public double getLenB() {
        return lenB;
    }

    public void setLenB(double lenB) {
        if (lenB < 0) {
            throw new RuntimeException("Invalid length : " + lenB);
        }
        this.lenB = lenB;
    }

    public double getLenC() {
        return lenC;
    }

    public void setLenC(double lenC) {
        if (lenC < 0) {
            throw new RuntimeException("Invalid length : " + lenC);
        }
        this.lenC = lenC;
    }

    @Override
    public double area() {
        return Math.sqrt(s * (s - lenA) * (s - lenB) * (s - lenC));
    }

    @Override
    public double perimeter() {
        return lenA + lenB + lenC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString() +
                ", lenA=" + lenA +
                ", lenB=" + lenB +
                ", lenC=" + lenC +
                '}';
    }
}
