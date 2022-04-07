package day09_IfStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println("Minimum number is "+num2);
        }
        else{
            System.out.println("Minimum number is "+num1);
        }
    }
}