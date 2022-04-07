package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();

        if (length <= 0 ){
            System.err.println("Invalid entry!");
            System.exit(0);
        }
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number "+(i+1));
            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        scan.close();

    }
}
