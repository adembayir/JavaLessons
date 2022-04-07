package day12_Scanner;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner; // * is wild import. It imports everything from util package

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer for day between 1 to 7: ");

        int num = scan.nextInt();
        String result ;

        if(num>= 1 && num<=7){
            switch (num){
                case 1:
                    result = "Monday";
                    break;

                case 2:
                    result = "Tuesday";
                    break;

                case 3:
                    result = "Wednesday";
                    break;

                case 4:
                    result = "Thursday";
                    break;

                case 5:
                    result = "Friday";
                    break;

                case 6:
                    result = "Saturday";
                    break;

                default:
                    result = "Sunday";
            }
        } else {
            result = "Invalid Number";
        }
        System.out.println(result);

        scan.close();

    }
}
