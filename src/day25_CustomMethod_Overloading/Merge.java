package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] arr1 = { 3, 5, 7, 9,};

        int[] arr2 = { 2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(merge(arr1,arr2)));

        System.out.println("\n---------------------------------------------------\n");

        double[] arr3 = { 2.7, 5.8, 8.4, 12.6, 19.5};

        double[] arr4 = { 12.75, 23.6, 48.24, 112.784};

        System.out.println(Arrays.toString(merge(arr3,arr4)));

        System.out.println("\n---------------------------------------------------\n");

        char[] arr5 = {'A', 'E', 'M', 'V', 'E', 'A', 'D', 'N'};

        char[] arr6 = {'D', 'M', 'E', 'A', 'D', 'A', 'E'};

        System.out.println(Arrays.toString(merge(arr5,arr6)));

        System.out.println("\n---------------------------------------------------\n");

        String[] arr7 = {"Benim", "ailem" };

        String[] arr8 = {"canim", "sizi", "seviyorum"};

        System.out.println(Arrays.toString(merge(arr7, arr8)));

    }

    public static int[] merge (int[] arr1, int[] arr2){
        int length = 0;
        if ( arr1.length > arr2.length){
            length = arr1.length;
        } else {
            length = arr2.length;
        }

        int[] result = new int[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0; i < result.length; i++) {
           if ( i < arr1.length ){
               result[j++] = arr1[i];
           }
           if ( i < arr2.length){
               result[j++] = arr2[i];
           }
        }
        return result;
    }

    public static double[] merge (double[] arr1, double[] arr2){
        double length = 0;
        if ( arr1.length > arr2.length){
            length = arr1.length;
        } else {
            length = arr2.length;
        }

        double[] result = new double[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0; i < result.length; i++) {
            if ( i < arr1.length ){
                result[j++] = arr1[i];
            }
            if ( i < arr2.length){
                result[j++] = arr2[i];
            }
        }
        return result;
    }

    public static char[] merge (char[] arr1, char[] arr2){
        int length = 0;
        if ( arr1.length > arr2.length){
            length = arr1.length;
        } else {
            length = arr2.length;
        }

        char[] result = new char[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0; i < result.length; i++) {
            if ( i < arr1.length ){
                result[j++] = arr1[i];
            }
            if ( i < arr2.length){
                result[j++] = arr2[i];
            }
        }
        return result;
    }

    public static String[] merge (String[] arr1, String[] arr2){
        int length = 0;
        if ( arr1.length > arr2.length){
            length = arr1.length;
        } else {
            length = arr2.length;
        }

        String[] result = new String[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0; i < result.length; i++) {
            if ( i < arr1.length ){
                result[j++] = arr1[i];
            }
            if ( i < arr2.length){
                result[j++] = arr2[i];
            }
        }
        return result;
    }

}
/*
Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
 */


