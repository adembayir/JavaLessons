package day10_NestedIf;

import java.util.Scanner;

public class NameOfMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of month: ");
        int numberOfMonth = input.nextInt();
        String nameOfMonth = null;

        if (numberOfMonth >= 1 && numberOfMonth <= 12) {
            if (numberOfMonth == 1) {
                nameOfMonth = "January";
            } else if (numberOfMonth == 2) {
                nameOfMonth = "February";
            } else if (numberOfMonth == 3) {
                nameOfMonth = "March";
            } else if (numberOfMonth == 4) {
                nameOfMonth = "April";
            } else if (numberOfMonth == 5) {
                nameOfMonth = "May";
            } else if (numberOfMonth == 6) {
                nameOfMonth = "June";
            } else if (numberOfMonth == 7) {
                nameOfMonth = "July";
            } else if (numberOfMonth == 8) {
                nameOfMonth = "August";
            } else if (numberOfMonth == 9) {
                nameOfMonth = "September";
            } else if (numberOfMonth == 10) {
                nameOfMonth = "October";
            } else if (numberOfMonth == 11) {
                nameOfMonth = "November";
            } else {
                nameOfMonth = "December";
            }
        } else {
            nameOfMonth = "INVALID";
        }

        System.out.println("The month is " + nameOfMonth);

    }
}
