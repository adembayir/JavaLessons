package day38_Inheritance.shapesTask;

public class ShapesTest {

    public static void main(String[] args) {

        Square square = new Square("Kare", 4.7);
        Circle circle = new Circle("Daire", 6);
        Rectangle rectangle = new Rectangle("Dikdörtgen", 3,4);

        System.out.println(square);
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
