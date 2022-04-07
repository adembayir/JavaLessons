package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // prints each integer element of an integer array in separate lines
    public static void printEachElement(int[] arr){
        for (int each : arr) {
            System.out.println(each);
        }
    }

    // prints each double element of a double array in separate lines
    public static void printEachElement(double[] arr){
        for (double each : arr) {
            System.out.println(each);
        }
    }

    // prints each String element of a String array in separate lines
    public static void printEachElement(String[] arr){
        for (String each : arr) {
            System.out.println(each);
        }
    }

    // prints each char element of a char array in separate lines
    public static void printEachElement(char[] arr){
        for (char each : arr) {
            System.out.println(each);
        }
    }

    // returns the maximum number from an integer array
    public static int maxNumber(int[] arr){
        int max = arr[0];

        for (int each : arr) {
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    // returns the maximum number from a double array
    public static double maxNumber(double[] arr){
        double max = arr[0];

        for (double each : arr) {
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    // returns the minimum number from an integer array
    public static int minNumber(int[] arr){
        Arrays.sort(arr);

        return arr[0];
    }

    // returns the minimum number from a double array
    public static double minNumber(double[] arr){
        Arrays.sort(arr);

        return arr[0];
    }

    //checks if the given integer is contained in the given array, returns boolean
    public static boolean contains(int[] arr, int element){
        boolean result = false;

        for (int each : arr) {
            if(each == element){
                result = true;
                break;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array, returns boolean
    public static boolean contains(double[] arr, double element){
        boolean result = false;

        for (double each : arr) {
            if(each == element){
                result = true;
                break;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array, returns boolean
    public static boolean contains(char[] arr, char element){
        boolean result = false;

        for (char each : arr) {
            if(each == element){
                result = true;
                break;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array, returns boolean
    public static boolean contains(String[] arr, String element){
        boolean result = false;

        for (String each : arr) {
            if(each.equals(element)){
                result = true;
                break;
            }
        }
        return result;
    }

    // adds the given integer element to integer array
    public static int[] addElement(int[] arr, int num){
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }

        newArray[newArray.length-1] = num;

        return newArray;
    }

    // adds the given double element to double array
    public static double[] addElement(double[] arr, double element){
        double[] result = new double[arr.length + 1];

        int i = 0;
        for (double each : arr) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    // adds the given String element to string array
    public static String[] addElement(String[] arr, String element){
        String[] result = new String[arr.length + 1];

        int i = 0;
        for (String each : arr) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    // adds the given char element to char array
    public static char[] addElement(char[] arr, char element){
        char[] result = new char[arr.length + 1];

        int i = 0;
        for (char each : arr) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    //returns the frequency of  the given element from the given array
    public static int frequencyOfElement(int[] arr, int element){
        int frequency = 0;
        for (int each : arr) {
            if(each == element){
                frequency++;
            }
        }
        return frequency;
    }

    //returns the frequency of  the given element from the given array
    public static int frequencyOfElement(double[] arr, double element){
        int frequency = 0;
        for (double each : arr) {
            if(each == element){
                frequency++;
            }
        }
        return frequency;
    }

    //returns the frequency of  the given element from the given array
    public static int frequencyOfElement(char[] arr, char element){
        int frequency = 0;
        for (char each : arr) {
            if(each == element){
                frequency++;
            }
        }
        return frequency;
    }

    //returns the frequency of  the given element from the given array
    public static int frequencyOfElement(String[] arr, String element){
        int frequency = 0;
        for (String each : arr) {
            if(each.equals(element)){
                frequency++;
            }
        }
        return frequency;
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

    // removes the element at the given index and returns a new array
    public static int[] removeElement(int[] arr, int index){

        if(index < 0 || index > arr.length - 1){
            System.err.println("Invalid Index!");
            System.exit(0);
        }

        int[] result = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }

    // removes the element at the given index and returns a new array
    public static double[] removeElement(double[] arr, int index){

        if(index < 0 || index > arr.length - 1){
            System.err.println("Invalid Index!");
            System.exit(0);
        }

        double[] result = new double[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }

    // removes the element at the given index and returns a new array
    public static char[] removeElement(char[] arr, int index){

        if(index < 0 || index > arr.length - 1){
            System.err.println("Invalid Index!");
            System.exit(0);
        }

        char[] result = new char[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }

    // removes the element at the given index and returns a new array
    public static String[] removeElement(String[] arr, int index){

        if(index < 0 || index > arr.length - 1){
            System.err.println("Invalid Index!");
            System.exit(0);
        }

        String[] result = new String[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }


    // merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    // merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result = {};

        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    // merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result = {};

        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    // merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result = {};

        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);
        }

        return result;
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

    // replaces the element of the array at given index with the new element, and returns the new array.
    public static int[] replaceElement(int[] arr, int index, int newElement){
        if (index < 0 || index > arr.length-1){
            System.err.println("Invalid index! :"+index);
            System.exit(0);
        }

        arr[index] = newElement;
        return arr;
    }

    // replaces the element of the array at given index with the new element, and returns the new array.
    public static double[] replaceElement(double[] arr, int index, double newElement){
        if (index < 0 || index > arr.length-1){
            System.err.println("Invalid index! :"+index);
            System.exit(0);
        }

        arr[index] = newElement;
        return arr;
    }

    // replaces the element of the array at given index with the new element, and returns the new array.
    public static char[] replaceElement(char[] arr, int index, char newElement){
        if (index < 0 || index > arr.length-1){
            System.err.println("Invalid index! :"+index);
            System.exit(0);
        }

        arr[index] = newElement;
        return arr;
    }

    // replaces the element of the array at given index with the new element, and returns the new array.
    public static String[] replaceElement(String[] arr, int index, String newElement){
        if (index < 0 || index > arr.length-1){
            System.err.println("Invalid index! :"+index);
            System.exit(0);
        }

        arr[index] = newElement;
        return arr;
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

    //inserts the given element to the given index of the array and returns the new array
    public static int[] insert(int[] arr, int index, int element){
        int[] result = new int[arr.length+1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(j == index){
                result[j++] = element;
                i--;
                continue;
            }
            result[j++] = arr[i];

        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static double[] insert(double[] arr, int index, double element){
        double[] result = new double[arr.length+1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(j == index){
                result[j++] = element;
                i--;
                continue;
            }
            result[j++] = arr[i];

        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static char[] insert(char[] arr, int index, char element){
        char[] result = new char[arr.length+1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(j == index){
                result[j++] = element;
                i--;
                continue;
            }
            result[j++] = arr[i];

        }
        return result;
    }

    //inserts the given element to the given index of the array and returns the new array
    public static String[] insert(String[] arr, int index, String element){
        String[] result = new String[arr.length+1];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(j == index){
                result[j++] = element;
                i--;
                continue;
            }
            result[j++] = arr[i];

        }
        return result;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static int[] swap(int[] arr, int index1, int index2){

        int dummy = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = dummy;
        return arr;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static double[] swap(double[] arr, int index1, int index2){

        double dummy = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = dummy;
        return arr;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static char[] swap(char[] arr, int index1, int index2){

        char dummy = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = dummy;
        return arr;
    }

    // swaps the element at index i with the element at index j, and returns the new array
    public static String[] swap(String[] arr, int index1, int index2){

        String dummy = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = dummy;
        return arr;
    }




}
