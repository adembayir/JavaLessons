package day08_IfStatement;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number = -0;

        boolean isItPositiveNumber = number >0;
        boolean isItNegativeNumber = number <0;
        boolean isNumber0 = number ==0;

        System.out.println(number +" is positive number: "+isItPositiveNumber);
        System.out.println(number +" is negative number: " + isItNegativeNumber);
        System.out.println(number +" is zero: " + isNumber0);

    }
}
/*
1. Create a class called IdentifyNumber, and write a program that
can identify if the given number is positive, or negative or zero.
    Ex: number = 200
output:
            200 is positive number: true
            200 is negative number: false
            200 is zero: false
 */