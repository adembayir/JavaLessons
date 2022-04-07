package day08_IfStatement;

import java.sql.SQLOutput;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 1;

        boolean evenNumber = number%2 ==0;

        if (evenNumber){
            System.out.println(number+" is even number.");
        }

        if (!evenNumber){
            System.out.println(number+" is odd number.");
        }

        /* System.out.println("Odd Number");

        System.out.println("Even Number"); */

        System.out.println("-----------------------------------------------------------------------------------");

        int n = -15;

        if (n>0){

            System.out.println(n+ " is positive number.");
        }

        if (n<0){

            System.out.println(n+ " is negative number.");
        }

        if (n==0){

            System.out.println(n+ " is zero.");
        }
    }
}
