package day28_ArrayList;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a new password: ");

        String password = scan.nextLine();


        int upperCase = 0;
        int lowerCase = 0;
        int specialCharacter = 0;
        int digit = 0;

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)){
                upperCase++;
            } else if (Character.isLowerCase(each)){
                lowerCase++;
            } else if (!Character.isLetterOrDigit(each)){
                specialCharacter++;
            } else if (Character.isDigit(each)){
                digit++;
            }
        }


        while ( !(upperCase >= 1 && lowerCase >= 1 && specialCharacter >= 1 && digit >= 1 && password.length() >= 8 && !password.contains(" "))){
                System.err.println("Password does not meet the requirements, please re-enter: ");
                password = scan.nextLine();


                upperCase = 0;
                lowerCase = 0;
                specialCharacter = 0;
                digit = 0;

                for (char each : password.toCharArray()) {
                    if (Character.isUpperCase(each)) {
                        upperCase++;
                    } else if (Character.isLowerCase(each)) {
                        lowerCase++;
                    } else if (!Character.isLetterOrDigit(each)) {
                        specialCharacter++;
                    } else if (Character.isDigit(each)) {
                        digit++;
                    }
                }
        }


        System.out.println("Strong password!");



    }
}
/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */