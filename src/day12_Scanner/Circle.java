package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter radius of circle: ");

        double radius = sc.nextDouble();
        sc.close();

        double area = 3.14*radius*radius;
        double perimeter = 2*3.14*radius;

        System.out.println("Perimeter is: "+perimeter);
        System.out.println("Area is: "+area);
    }
}
