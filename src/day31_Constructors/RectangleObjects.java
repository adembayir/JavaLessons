package day31_Constructors;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(12,8);

        System.out.println("Perimeter : " + rectangle1.perimeter());
        System.out.println("Area : " + rectangle1.calculateArea());

        System.out.println(rectangle1);

    }
}
