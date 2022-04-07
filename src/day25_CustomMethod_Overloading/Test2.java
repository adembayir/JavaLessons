package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("=====================================================");

        String[] arr2 = {"One", "Two", "Three", "Four", "Five"};
        ArraysUtility.printEachElement(arr2);

        System.out.println("=====================================================");

        double[] arr3 = { 1.5, 2.5, 3.5, 4.5, 5.5};
        ArraysUtility.printEachElement(arr3);

        System.out.println("=====================================================");

        char[] arr4 = {'a', 'b', 'c', 'd', 'e'};
        ArraysUtility.printEachElement(arr4);

        System.out.println("=====================================================");

        System.out.println("Max number of integer array is: "+ArraysUtility.maxNumber(arr1));

        System.out.println("Max number of double array is: "+ArraysUtility.maxNumber(arr3));

        System.out.println("=====================================================");

        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(ArraysUtility.contains(a1,5));

    }
}
