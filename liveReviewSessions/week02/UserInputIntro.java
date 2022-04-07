package week02;

import java.util.Scanner;

public class UserInputIntro {

    public static void main(String[] args) {

        //output goes to console --- print or println

        System.out.println("Output");

        // How can I receive input for my java class

        // 1. create your scanner object (object name can be anything)
        Scanner input = new Scanner(System.in);

        // 2. prompt th user for putting input
        System.out.println("Put your name : ");  // this is printed out to console

        // 3. get the input

        String name = input.next(); // reads the data from console and assigns the value to my variable

        // 4. use the value that user wrote

        System.out.println("name = " + name);

        // step 1 and 3 are MUST (mandatory)


    }
}
