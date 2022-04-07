package week03;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        double num1 , num2 , num3 , num4 , total ; // declaring variables
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 4 numbers: ");

        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();
        num4 = input.nextDouble();

        total = num1 + num2 + num3 + num4 ;

        System.out.println("total = " + total);
    }
}
