package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingAddElement {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};

        arr1 = addElement(arr1, 7);

        System.out.println(Arrays.toString(arr1));

        System.out.println("\n-------------------------------------------------\n");

        String[] arr2 = {"Adem", "Eda", "Aden", "Meva"};

        arr2 = addElement(arr2, "Pati");

        System.out.println(Arrays.toString(arr2));

        System.out.println("\n-------------------------------------------------\n");

        char[] arr3 = {'A', 'B', 'C', 'D', 'E'};

        arr3 = addElement(arr3, 'F');

        System.out.println(Arrays.toString(arr3));

    }

    public static int[] addElement(int[] arr, int num){
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        newArray[newArray.length-1] = num;

        return newArray;
    }

    public static double[] addElement(double[] arr, double element){
        double[] result = new double[arr.length + 1];

        int i = 0;
        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    public static String[] addElement(String[] arr, String element){
        String[] result = new String[arr.length + 1];

        int i = 0;
        for (String each : arr) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    public static char[] addElement(char[] arr, char element){
        char[] result = new char[arr.length + 1];

        int i = 0;
        for (char each : arr) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    
}
