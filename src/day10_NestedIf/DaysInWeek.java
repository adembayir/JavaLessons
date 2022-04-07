package day10_NestedIf;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the day: ");

        int n = input.nextInt(); // 1 ~ 7 pre condition

        /* if (n == 1) {
            System.out.println("It's Monday.");
        } else if (n == 2) {
            System.out.println("It's Tuesday.");
        } else if (n == 3) {
            System.out.println("It's Wednesday, my dudes.");
        } else if (n == 4) {
            System.out.println("It's Thursday.");
        } else if (n == 5) {
            System.out.println("It's Friday.");
        } else if (n == 6) {
            System.out.println("It's Saturday.");
        } else if (n == 7) {
            System.out.println("It's Sunday.");
        } else {
            System.out.println("INVALID.");
        }
         */

        String result = (n == 1)? "It's Monday." : (n == 2) ? "It's Tuesday." : (n == 3) ? "It's Wednesday, my dudes." :
                        (n == 4)? "It's Thursday." : (n == 5) ? "It's Friday." : (n == 6) ? "It's Saturday." :
                        (n == 7)? "It's Sunday." : "INVALID." ;

        System.out.println(result);



    }
}
