package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAllElements {

    public static void main(String[] args) {

        int[] arr = {10, 10, 20, 30, 40, 30, 30, 50};

        System.out.println(Arrays.toString(replaceAllElements(arr, 30, 300)));


    }

    //replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
    public static int[] replaceAllElements(int[] arr, int oldElement, int newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }

    //replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
    public static double[] replaceAllElements(double[] arr, double oldElement, double newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }

    //replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
    public static char[] replaceAllElements(char[] arr, char oldElement, char newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldElement){
                arr[i] = newElement;
            }
        }
        return arr;
    }

    //replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
    public static String[] replaceAllElements(String[] arr, String oldElement, String newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(oldElement)){
                arr[i] = newElement;
            }
        }
        return arr;
    }

}