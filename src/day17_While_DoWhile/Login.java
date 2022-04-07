package day17_While_DoWhile;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        // username: "Cydeo"
        // password: "Cydeo123"

        int attempt = 3;
        String password = null;

        // while ( invalid && hasAttempts)


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        password = scan.next();
        attempt--;
        while ( (!password.equals("Cydeo123")) && attempt>=1 ){
            System.err.println("Invalid Password");
            System.out.println("You have "+attempt+" attempt(s) left\nEnter your password");
            password = scan.next();
            attempt--;
        }
        if ( !(attempt>=1) ){
            System.err.println("Your account has been blocked\nPlease contact your customer representative");
        }


        if (password.equals("Cydeo123"))
            System.out.println("Logged in");



    }
}
