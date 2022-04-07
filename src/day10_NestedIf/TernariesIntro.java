package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        /* if (n%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

         */


        String result1 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("-----------------------------------------------------------------");

        int age = 21;

        /* if (age >= 21){
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }

         */

        String result2 = (age >= 21) ? "Eligible to buy alcohol." : "Not eligible to buy alcohol.";

        System.out.println(result2);

        System.out.println("-----------------------------------------------------------------");

        int number = 0;

        /*if (number>0){
            System.out.println("Positive");
        } else if (number<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

         */

        String result3 = (number>0)? "Positive" : (number<0) ? "Negative" : "Zero";

        System.out.println(result3);


    }
}
