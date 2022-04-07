package day35_Encapsulation.encapsulation;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(25);

        System.out.println("Area :" + circle1.calcArea());
        System.out.println("Perimeter :" + circle1.calcPerimeter());

        System.out.println("Pi :" + Circle.pi);
        System.out.println("Radius :" + circle1.getRadius());

        circle1.setRadius(2.5);

        System.out.println("Area :" + circle1.calcArea());
        System.out.println("Perimeter :" + circle1.calcPerimeter());


    }




}
