package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_nextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName =scan.nextLine();

        System.out.println("Enter your Programming Language: ");
        String programmingLanguage = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your school name: ");
        String school = scan.nextLine();
        scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("school = " + school);

    }
}
