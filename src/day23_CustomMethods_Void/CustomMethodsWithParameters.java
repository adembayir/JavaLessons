package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(13);

        ageOfPerson(1988);

        printNumbers(74,56);

    }

    // create a function that can check if a number is odd number or even number

    public static void oddOrEven(int number){
        if (number%2 == 0){
            System.out.println(number+" is even number");
        } else {
            System.out.println(number+" is odd number");
        }
    }

    // create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){
        System.out.println("The age of the person is "+(2022-birthYear));
    }

    // create a function that can print all the numbers between X and Y

    public static void printNumbers(int num1, int num2){
        for (int i = num1; i <= num2 ; i++) {
            System.out.println(i);
        }
    }

}
