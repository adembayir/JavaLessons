package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old

        byte age = 38;

        //  weight: 160 pounds
        //  byte weight = 160; 160 is out of byte range

        short weight = 160; // 160 is within the range of the short

        // salary : 100000 $
        // short salary = 100000; 100000 is out of short range

        int salary = 100_000;

        /* int is preferred data type for integer numbers,
        for make it easily readable, use underscore "_" to divide every 3 digits
         */

        long asset = 3_333_333_333L; // !!! very important, user should add "l" or "L" at the end of the large numbers

        // tax: 0.26, tip: 0.10

        double tax = 0.26;

        float tip = 0.1F; // very important, user should add "f" or "F" at the end of the float numbers

        double pi = 3.14;

        // #

        char ch1 = '#';
        char ch2 = 35;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        
        char ch3 = 2000;
        System.out.println("ch3 = " + ch3);
        char ch4 = 33300;
        System.out.println("ch4 = " + ch4);
        char ch5 = 65535;
        System.out.println("ch5 = " + ch5);
    }
}
