package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------------------------------");

        String[] familyMembers = {"Adem","Neriman Eda","Aden","Meva"};

        Arrays.sort(familyMembers);

        System.out.println(Arrays.toString(familyMembers));

        int[] scores = {100, 70, 55, 82, 95, 66 };

        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        System.out.println("Max score is: "+scores[scores.length-1]);
        System.out.println("Min score is: "+scores[0]);

        System.out.println("--------------------------------------------------");

        int[] arr1 = {1, 3, 2};
        int[] arr2 = {1, 2, 3};

        System.out.println(Arrays.equals(arr1,arr2)); //Array.equals() method compares two arrays index by index, if they
        // are equal, it turns true, else turns false boolean result.

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println("--------------------------------------------------");




    }
}
