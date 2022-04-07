package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i <= 100 ; i++) { // i : 1

            sum += i; // 1-
        }
        System.out.println(sum);

       /* System.out.println("-----------------------------------------------------------------");

        double sum2 = 0;
        Scanner scan = new Scanner(System.in);
        for ( int i =1; i <=5; i++) {
            System.out.println("Enter number "+i);
            sum2 += scan.nextDouble();
        }
        scan.close();
        System.out.println(sum2);

        */

    }
}
