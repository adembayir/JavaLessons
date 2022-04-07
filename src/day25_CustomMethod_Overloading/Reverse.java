package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        nums = reverse(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("\n---------------------------------------------------\n");

        double[] doubles = { 2.7, 5.8, 8.4, 12.6, 19.5};

        doubles = reverse(doubles);

        System.out.println(Arrays.toString(doubles));

        System.out.println("\n---------------------------------------------------\n");

        char[] chars = {'A', 'E', 'M', 'V', 'E', 'A', 'D', 'N'};

        chars = reverse(chars);

        System.out.println(Arrays.toString(chars));

        System.out.println("\n---------------------------------------------------\n");
        
        String[] strings = {"Hatice", "Mehmet Ali", "Havva", "Ibrahim"};

        strings = reverse(strings);

        System.out.println(Arrays.toString(strings));




    }

    public static int[] reverse (int[] arr){
        int[] result = new int[arr.length];

        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            result[i] = arr[j];
        }
        return result;
    }

    public static double[] reverse (double[] arr){
        double[] result = new double[arr.length];

        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            result[i] = arr[j];
        }
        return result;
    }

    public static char[] reverse (char[] arr){
        char[] result = new char[arr.length];

        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            result[i] = arr[j];
        }
        return result;
    }

    public static String[] reverse (String[] arr){
        String[] result = new String[arr.length];

        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            result[i] = arr[j];
        }
        return result;
    }
    
    
}
