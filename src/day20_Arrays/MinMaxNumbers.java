package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 10 number!");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number: "+(i+1));
            numbers[i] = scan.nextInt();
        }
        
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] < min){
                min = numbers[i];
            }
        }
        
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
