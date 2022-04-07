package day10_NestedIf;

import java.sql.SQLOutput;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }

        System.out.println("------------------------------------------------------------------------------");

        int age = 25;
        boolean hasId = true;

        if (hasId) {
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        } else {
            System.out.println("You must have an ID to buy alcohol");
        }

        System.out.println("------------------------------------------------------------------------------");

        int number = 5;

        if (number >= 1 && number <=7) {
            if (number == 1) {
                System.out.println("It's Monday");
            } else if (number == 2) {
                System.out.println("It's Tuesday");
            } else if (number == 3) {
                System.out.println("It's Wednesday");
            } else if (number == 4) {
                System.out.println("It's Thursday");
            } else if (number == 5) {
                System.out.println("It's Friday");
            } else if (number == 6) {
                System.out.println("It's Saturday");
            } else {
                System.out.println("It's Sunday");
            }
        } else {
            System.out.println("INVALID NUMBER");
        }





        }



    }

