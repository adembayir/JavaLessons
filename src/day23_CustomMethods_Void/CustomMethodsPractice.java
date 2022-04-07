package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("---------------------------------------------------------------------");

        helloCydeo5Times();

        System.out.println("---------------------------------------------------------------------");

        evenNumbers1to10();
    }

    // create a function that can print "Hello World" 5 times ==> helloWorld5Times

    public static void helloWorld5Times (){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    // create a function that can print "Hello Cydeo" 5 times ==> helloCydeo5Times

    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    // create a function that can print all the even numbers from 1 ~ 10

    public static void evenNumbers1to10(){
        for (int i = 1; i <=10 ; i++) {
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }



}
