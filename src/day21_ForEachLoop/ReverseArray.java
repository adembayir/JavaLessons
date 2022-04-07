package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};

        int[] reversed = new int[nums.length]; // {50, 40, 30, 20, 10}

        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = nums[i] ;
        }

        System.out.println(Arrays.toString(reversed));

    }
}
