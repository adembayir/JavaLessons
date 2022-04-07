package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647; //19

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Enter number "+i);
            int num =scan.nextInt(); // 19

            if (num<min)
            min = num ;
        }
        System.out.println(min);

    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the minimum number.
 */