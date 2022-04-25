package week15;

import java.util.Scanner;

public class RuntimeErrorExample {

    public static void main(String[] args) {

        System.out.println("Hello");

        int x = 5;

        int y = new Scanner(System.in).nextInt();

        try {
            System.out.println(x / y); // when user puts zero as y, this line will be skipped.
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("How are you today");
        System.out.println("Some more lines of codes");
        System.out.println("We swallowed the exception object");
    }
}
