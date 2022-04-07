package day20_Arrays;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = { 8, 14, 25, 4, 78, 118};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if ( min > numbers[i]){
                min = numbers[i];
            }
        }

        System.out.println(min);


    }
}
