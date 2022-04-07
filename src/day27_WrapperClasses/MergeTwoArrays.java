package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };  //{8,7,6,5,4}

        int[] new1D = new int[arr2D[1].length];

        int j = 0;
        for (int i = arr2D[1].length - 1; i >= 0; i--) {
            new1D[j++] = arr2D[1][i];
        }

        arr2D[1] = new1D;

        System.out.println(Arrays.deepToString(arr2D));

        }
    }



