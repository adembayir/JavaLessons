package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {


        /*
        Task2:
		1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array
         */

        int[] arr = {1, 2, 3, 4};
        int num = 5;

        System.out.println(Arrays.toString(addInteger(arr,num)));

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        System.out.println(Arrays.toString(addDouble(arr2, 5.5)));

        String[] arr3 = {"Adem", "Eda", "Aden", "Meva"};

        System.out.println(Arrays.toString(addString(arr3,"Pati")));

        char[] arr4 = {'N','e','r','i','m','a'};

        System.out.println(Arrays.toString(addChar(arr4,'n')));


    }

    public static int[] addInteger(int[] arr, int num){
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        newArray[newArray.length-1] = num;

        return newArray;
    }

    public static double[] addDouble(double[] arr, double element){
        double[] result = new double[arr.length + 1];

        int i = 0;
        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    public static String[] addString(String[] arr, String element){
        String[] result = new String[arr.length + 1];

        int i = 0;
        for (String each : arr) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    public static char[] addChar(char[] arr, char element){
        char[] result = new char[arr.length + 1];

        int i = 0;
        for (char each : arr) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }



}
