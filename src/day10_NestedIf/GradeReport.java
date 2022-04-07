package day10_NestedIf;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your exam score: ");
        int score = keyboard.nextInt();
        boolean validScore = score >= 0 && score <= 100;

        if (validScore) {
            if (score >= 90l) {
                System.out.println("Your Grade is A, Excellent.");
            } else if (score >= 80) {
                System.out.println("Your Grade is B, Great.");
            } else if (score >= 70) {
                System.out.println("Your Grade is C, Good.");
            } else if (score >= 60) {
                System.out.println("Your Grade is D, Passed.");
            } else {
                System.out.println("Your Grade is F, Failed. Shame on you, Moron!");
            }
        } else {
            System.out.println("INVALID SCORE");

        }


    }
}
/*
90- 100 : excellent
80 - 89 : Great
70 - 79 : Good
60 - 69 : Passed
0  - 59 : Failed
 */