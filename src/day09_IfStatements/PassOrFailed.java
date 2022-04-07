package day09_IfStatements;

import java.util.Scanner;

public class PassOrFailed {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your score: ");

        int score = keyboard.nextInt();

        if(score>=60){
            System.out.println("Congratulations, you passed");
        }
        else{
            System.out.println("You failed.");
        }

    }
}
