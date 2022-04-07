package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

        System.out.println("Enter a number");
        int num = scan.nextInt();

        if (num%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        System.out.println("Would you like to enter another number?");
        String answer = scan.next();

        while ( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ) {
            System.err.println("Invalid answer, please re-enter. Would you like to enter another number?");
            answer = scan.next();
        }


        if (answer.equalsIgnoreCase("no")){
            break;
        }
        }

    }
}
