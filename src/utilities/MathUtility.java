package utilities;

public class MathUtility {
    
    // sums up two given integer, returns integer
    public static int sum(int num1, int num2){
        return num1+num2;
    }
    
    // sums up two given double, returns double
    public static double sum(double num1, double num2){
        return num1+num2;
    }
    
    // subtracts two given integer, returns integer
    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    // subtracts two given double, returns double
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }
    
    // multiples two given int, returns int
    public static int multiplication(int num1, int num2){
        return num1*num2;
    }

    // multiples two given double, returns double
    public static double multiplication(double num1, double num2){
        return num1*num2;
    }
    
    // divides two given double number, returns double
    public static double division(double num1, double num2){
        return num1/num2;
    }
    
    // checks given integer is even number, returns boolean
    public static boolean even(int num){
        boolean even = false;
        
        if (num%2 == 0){
            even = true;
        }
        return even;
    }

    // checks given integer is odd number, returns boolean
    public static boolean odd(int num){
        boolean odd = false;

        if (num%2 == 1){
            odd = true;
        }
        return odd;
    }
    
    // returns the maximum number between two given integers
    public static int max(int num1, int num2){
        if(num1 > num2)
            return num1;
        else
            return num2;        
    }

    // returns the maximum number between two given doubles
    public static double max(double num1, double num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }

    // returns the minimum number between two given integers
    public static int min(int num1, int num2){
        if(num1 > num2)
            return num2;
        else
            return num1;
    }

    // returns the minimum number between two given doubles
    public static double min(double num1, double num2){
        if(num1 > num2)
            return num2;
        else
            return num1;
    }
    
    // returns the square of the given integer
    public static int square(int num){
        return num*num;
    }

    // returns the square of the given double
    public static double square(double num){
        return num*num;
    }
    
    //returns the cube of the given integer
    public static int cube(int num){
        return num*num*num;
    }

    //returns the cube of the given double
    public static double cube(double num){
        return num*num*num;
    }
    
    
}