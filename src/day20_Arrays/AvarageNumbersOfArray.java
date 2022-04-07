package day20_Arrays;

public class AvarageNumbersOfArray {

    public static void main(String[] args) {

        int[] numbers = { 11, 20, 30, 40, 50, 60};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double averageNumber = (double) sum/ numbers.length;

        System.out.println("averageNumber = " + averageNumber);
    }
}
