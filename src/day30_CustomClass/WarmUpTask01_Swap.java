package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class WarmUpTask01_Swap {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Collections.swap(list, 0, list.size()-1);

        System.out.println(list);

    }
}
// 1. write a program than can swap the first and last elements of an ArrayList