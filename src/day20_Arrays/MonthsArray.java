package day20_Arrays;

import java.util.Scanner;

public class MonthsArray {

    public static void main(String[] args) {

        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of the month?");
        int number = scan.nextInt();

        if (number < 1 && number > 12){
            System.err.println("Invalid entry!");
            System.exit(0);
        }

        System.out.println(months[number-1]);
    }
}
