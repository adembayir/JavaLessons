package day25_CustomMethod_Overloading;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray = {5,6,0,-1,3,4};

        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};


        System.out.println("--------------------------------------------------------------------");


        int sum1 = sumOfNumbers(10,20);

        int sum2 = sumOfNumbers(10,20,30,40);

        double sum3 = sumOfNumbers(18.2 ,30.7);

        double sum4 = sumOfNumbers(20.6,51.7,3.8,31);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }

    public static int sumOfNumbers(int num1, int num2){

        return num1+num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3){

        return num1+num2+num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1+num2+num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4){

        return num1+num2+num3+num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4){

        return num1+num2+num3+num4;
    }

}

/*
    Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
     */