package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter age: ");
        int age = input.nextInt();

        System.out.println("Please enter full name");
        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

    }
}
/*
1. ask the user enter age ( nextInt() )
2. ask the user enter full name ( nextLine() )
 */