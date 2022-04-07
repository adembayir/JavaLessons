package day09_IfStatements;

import java.util.Scanner;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = keyboard.nextInt();

        if (age>=18){
            System.out.println("You can buy alcoholic beverages.");
        }
        else{
            System.out.println("You CANNOT buy alcoholic beverages.");
        }
    }
}
