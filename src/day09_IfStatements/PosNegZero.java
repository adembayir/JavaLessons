package day09_IfStatements;

import java.util.Scanner;

public class PosNegZero {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int n = keyboard.nextInt();

        if (n>0) {
            System.out.println("Positive");
        }
        else if (n<0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
