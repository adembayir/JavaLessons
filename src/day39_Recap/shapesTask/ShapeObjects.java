package day39_Recap.shapesTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);

        System.out.println("================================================================");

        Rectangle rectangle = new Rectangle(15, 20);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle);

        System.out.println("================================================================");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        circle.setRadius(15);

        System.out.println(circle);


    }
}
