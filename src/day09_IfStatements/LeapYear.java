package day09_IfStatements;


import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yıl bilgisi giriniz: ");

        int year = input.nextInt();

        if(year%4==0){

            System.out.println(year+ " is leap year.");
        }
        else {
            System.out.println(year+ " is NOT a leap year.");
        }
    }
}
