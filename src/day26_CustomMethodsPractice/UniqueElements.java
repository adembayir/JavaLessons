package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,3,4,4,4,5,55,6,6,7,8,9,9};

        System.out.println(Arrays.toString(uniqueElements(arr)));

        double[] arr2 = {1.3, 3.7, 4.5, 1.3, 4.5, 6.8, 8.2, 6.8, 9.5};

        double[] unique = uniqueElements(arr2);

        System.out.println(Arrays.toString(unique));


    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] arr){
        int[] result = {};

        for (int each : arr) {
            if(ArraysUtility.frequencyOfElement(arr,each) == 1){ // if the frequency is 1, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] arr){
        double[] result = {};

        for (double each : arr) {
            if(ArraysUtility.frequencyOfElement(arr,each) == 1){ // if the frequency is 1, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] arr){
        char[] result = {};

        for (char each : arr) {
            if(ArraysUtility.frequencyOfElement(arr,each) == 1){ // if the frequency is 1, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] arr){
        String[] result = {};

        for (String each : arr) {
            if(ArraysUtility.frequencyOfElement(arr,each) == 1){ // if the frequency is 1, the element is unique
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


}
