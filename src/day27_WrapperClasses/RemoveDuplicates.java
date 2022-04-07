package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr1 = {1,1,1,2,3,4,5,6,6,7,8,9,0,0,0};

        arr1 = removeDuplicates(arr1);

        System.out.println(Arrays.toString(arr1));

        String[] words = {"Java", "Java", "Python", "C#", "Java"};

        words = ArraysUtility.removeDuplicates(words);

        System.out.println(Arrays.toString(words));
        
    }

    // removes duplicated elements from given array and returns array
    public static int[] removeDuplicates(int[] arr){
        int[] result = {};

        for (int each : arr) {
            if( !(ArraysUtility.contains(result,each))){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes duplicated elements from given array and returns array
    public static double[] removeDuplicates(double[] arr){
        double[] result = {};

        for (double each : arr) {
            if( !(ArraysUtility.contains(result,each))){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes duplicated elements from given array and returns array
    public static char[] removeDuplicates(char[] arr){
        char[] result = {};

        for (char each : arr) {
            if( !(ArraysUtility.contains(result,each))){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // removes duplicated elements from given array and returns array
    public static String[] removeDuplicates(String[] arr){
        String[] result = {};

        for (String each : arr) {
            if( !(ArraysUtility.contains(result,each))){
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }
    
    
    
}
