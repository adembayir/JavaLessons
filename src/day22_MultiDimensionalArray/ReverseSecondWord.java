package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java"; //I evoL Java

        String[] word = sentence.split(" ");

        String reversedSecond = "";

        for (int i = word[1].length()-1; i >= 0 ; i--) {
            reversedSecond += word[1].charAt(i);
        }

        word[1] = reversedSecond;

        String result ="";

        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i]+" ");
        }




    }
}
/*
2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */