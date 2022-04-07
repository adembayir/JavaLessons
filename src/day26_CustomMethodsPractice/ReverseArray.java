package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 30, 40, 50, 60};

        int[] newArr = reverse(arr);

        System.out.println(Arrays.toString(newArr));
    }

    // reverse given array, returns array
    public static int[] reverse (int[] arr){
        
        int[] result = new int[arr.length];
        
        int i = arr.length-1;

        for (int each : arr) {
            result[i--] = each;
        }
        return result;
    }

    // reverse given array, returns array
    public static double[] reverse (double[] arr){

        double[] result = new double[arr.length];

        int i = arr.length-1;

        for (double each : arr) {
            result[i--] = each;
        }
        return result;
    }

    // reverse given array, returns array
    public static char[] reverse (char[] arr){

        char[] result = new char[arr.length];

        int i = arr.length-1;

        for (char each : arr) {
            result[i--] = each;
        }
        return result;
    }

    // reverse given array, returns array
    public static String[] reverse (String[] arr){

        String[] result = new String[arr.length];

        int i = arr.length-1;

        for (String each : arr) {
            result[i--] = each;
        }
        return result;
    }
}
