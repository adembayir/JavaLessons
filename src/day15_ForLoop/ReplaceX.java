package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        System.out.println("Please enter your word: ");
        String str = new Scanner(System.in).next();

        str = str.replace("x","a").replace("X","a");

        System.out.println(str);



    }
}
