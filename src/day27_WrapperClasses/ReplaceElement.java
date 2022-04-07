package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(replaceElement(arr,2,300)));

        System.out.println("============================================================");

        String[] str1 = {"Java", "Python", "C++", "Ruby"};

        System.out.println(Arrays.toString(replaceElement(str1,2, "C#")));

    }

    // replaces the element of the array at given index with the new element, and returns the new array.
    public static int[] replaceElement(int[] arr, int index, int newElement){
        arr[index] = newElement;
        return arr;
    }

    // replaces the element of the array at given index with the new element, and returns the new array.
    public static double[] replaceElement(double[] arr, int index, double newElement){
        arr[index] = newElement;
        return arr;
    }

    // replaces the element of the array at given index with the new element, and returns the new array.
    public static char[] replaceElement(char[] arr, int index, char newElement){
        arr[index] = newElement;
        return arr;
    }

    // replaces the element of the array at given index with the new element, and returns the new array.
    public static String[] replaceElement(String[] arr, int index, String newElement){
        arr[index] = newElement;
        return arr;
    }
    
    
}
