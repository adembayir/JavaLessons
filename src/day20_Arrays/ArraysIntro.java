package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        //String[] students = new String[5];

        String[] myFamily;
        myFamily = new String[4];

        // System.out.println(students); //not the right way to print Array. It gives hashcode.

        myFamily[0] = "Adem";
        myFamily[1] = "Neriman Eda";
        myFamily[2] = "Aden";
        myFamily[3] = "Meva";

        System.out.println(Arrays.toString(myFamily));

        System.out.println("---------------------------------------------------------------");

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 1;

        if (number < 1 && number > 7){
            System.err.println("Invalid number!");
            System.exit(0);
        }

        System.out.println(days[number-1]);

    }
}
