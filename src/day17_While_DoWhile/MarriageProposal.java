package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.next();

        while (  !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
            System.err.println("Invalid answer");
            System.err.println("Will you marry me?");
            answer = scan.next();
        }

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Congrats!");
        } else {
            System.out.println("Goodbye! ");
        }
    }
}
