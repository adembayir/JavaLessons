package day19_LoopPractices;

public class FirstDuplicatedCharacter {

    public static void main(String[] args) {

        String str = "abcddeffghhi";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    count++;
                }
            }

            if (count > 1 ){
                result += ""+ch;
                break;
            }

        }

        System.out.println(result);


    }
}
/*
1. Write a program that can return the first duplicated character
from a string
 */