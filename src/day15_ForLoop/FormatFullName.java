package day15_ForLoop;

import java.util.Locale;
import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = scan.next();
        System.out.println("Please enter your last name: ");
        String lastName = scan.next();

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
    }
}
