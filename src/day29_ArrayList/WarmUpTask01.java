package day29_ArrayList;

import java.util.ArrayList;

public class WarmUpTask01 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(13);
        list.add(13);
        list.add(27);
        list.add(35);
        list.add(39);
        list.add(62);
        list.add(78);
        list.add(35);
        list.add(78);
        list.add(96);
        list.add(27);
        list.add(13);

        System.out.println(list);


        for (Integer each : list) {
            int count = 0;
            for (Integer each2 : list) {
                if(each == each2){
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("First unique element is " + each);
                break;
            }
        }


    }
}
/*
1. Write a program that can return the first unique elements from an
arraylist
Do not use indexOf & lastIndexOf methods
 */