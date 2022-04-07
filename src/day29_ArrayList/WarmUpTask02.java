package day29_ArrayList;

import java.util.ArrayList;

public class WarmUpTask02 {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(19);
        arrList.add(27);
        arrList.add(32);
        arrList.add(44);
        arrList.add(57);
        arrList.add(61);

        System.out.println("Maximum number of array list is: "+maxOfArrList(arrList));
        System.out.println("Minimum number of array list is: "+minOfArrList(arrList));
        System.out.println("Average number of array list is: "+averageOfArrList(arrList));


    }

    public static int maxOfArrList(ArrayList<Integer> arrList){
        int max = Integer.MIN_VALUE;

        for (Integer each : arrList) {
            if (each > max){
                max = each;
            }
        }

        return max;
    }

    public static int minOfArrList(ArrayList<Integer> arrList){
        int min = Integer.MAX_VALUE;

        for (Integer each : arrList) {
            if (each < min){
                min = each;
            }
        }

        return min;
    }

    public static double averageOfArrList(ArrayList<Integer> arrList){
        double sum = 0;
        for (Integer each : arrList) {
            sum += each;
        }
        return sum/arrList.size();
    }
}
/*
2. Write a program that can find the maximum, minimum and average number from an arrayList of integers
 */