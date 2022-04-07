package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 38, 43, 65, 3 };

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}
