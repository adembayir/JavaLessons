package day11;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'A';

        switch (ch){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;

            default:
                System.out.println("Failed");
        }





    }
}
/*
    if th grade is A or B or C or D ==========> "Passed"
    otherwise =========> 'failed'
 */