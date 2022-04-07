package day13_String;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {


        String word = "Cydeo";

        char thirdCharacter = word.charAt(2);

        System.out.println("thirdCharacter = " + thirdCharacter);

        /*
        char tenthChar = word.charAt(9);

        System.out.println("tenthChar = " + tenthChar);
         */

        System.out.println("------------------------------------------------------------------");

        String s1 = "Batch EU8 is the best batch ever. heyooooo";

        int total=s1.length();

        System.out.println("total = " + total);

        char lastChar = s1.charAt(total-1);

        System.out.println("lastChar = " + lastChar);

        System.out.println("------------------------------------------------------------------");

        String str = "wooden spoon";

        str = str.toUpperCase(); // "WOODEN SPOON"

        System.out.println(str);

        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();

        System.out.println("sentence = " + sentence);

    }
}
