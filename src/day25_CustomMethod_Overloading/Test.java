package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String s1 = "Wooden Spoon";

        String s2 = StringUtility.reverse(s1);

        System.out.println(s2);

        System.out.println("------------------------------------------------------");

        String word = "Java";

        boolean palindrome = StringUtility.palindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("------------------------------------------------------");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo", "level"};

        int count = 0;

        for (String name : names) {
            if(StringUtility.palindrome(name)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("------------------------------------------------------");

        String str2 = "aaaaaabbbbbbccccddddddd";

        System.out.println(StringUtility.removeDuplicates(str2));

        System.out.println("------------------------------------------------------");

        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int[] arr2 = {2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(ArraysUtility.merge(arr1,arr2)));



    }
}
