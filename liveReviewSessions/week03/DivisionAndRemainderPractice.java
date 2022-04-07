package week03;

import java.util.Scanner;

public class DivisionAndRemainderPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter seconds: ");
        int seconds = input.nextInt();

        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int second2 = ((seconds%3600)%60);

        System.out.println(hours + " : " + minutes + " : " + second2 );
    }
}
