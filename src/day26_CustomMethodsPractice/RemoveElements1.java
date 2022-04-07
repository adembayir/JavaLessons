package day26_CustomMethodsPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

    int[] arr = {2, 8, 12, 19, 26, 35};

        System.out.println(Arrays.toString(removeElement(arr,2)));

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


}
/*
2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array
 */