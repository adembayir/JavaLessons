package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int year = 2022;
        int number = 11;
        String result = null;

        if (number >= 1 && number <= 12){
            switch (number){
                case 2:
                    result = (year%4 != 0)? "28 Days" : "29 Days";
                    break;
                case 4: case 6 : case 9 : case 11 :
                    result = "30 Days";
                    break;
                default:
                    result = "31 Days";
            }
        } else {
            result = "Invalid number";
        }

        System.out.println(result);
    }
}
/*
28 days : 2
30 days : 4, 6, 9, 11
31 days : 1, 3, 5, 7, 8, 10, 12
 */