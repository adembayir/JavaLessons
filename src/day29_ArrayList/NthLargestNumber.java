package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

    //  int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 8, 8};

        int n = 5;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        for (int i = 0; i < n-1 ; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) > max) {
                    max = list.get(j);
                }
            }
            int finalMax = max;
            list.removeIf(p -> p == finalMax);
        }

        System.out.println(Collections.max(list));


    }
}
/*
1. write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:	4
 */