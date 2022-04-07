package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask02_MoveZeros {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0, 7, 0, 0, 6));

        int countOf0 = 0;

        for (Integer each : list) {
            if ( each == 0){
                countOf0++;
            }
        }

        list.removeAll(Arrays.asList(0));

        for (int i = 0; i < countOf0; i++) {
            list.add(0);
        }




        System.out.println("list = " + list);
        
    }
}
/*
2. Write a program that can move all the zeros to the last indexes of ArrayList
        Ex:
            list: {1, 0, 2, 0, 3, 0, 4, 0}
            
        output:
            [1, 2, 3, 4, 0, 0, 0, 0]    
 */