package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = -456, b = 3, c = 2;

        boolean medA = b < a && a < c && b < c || c < a && a < b && c < b,
                medB = a < b && b < c && a < c || c < b && b < a && c < a,
                medC = a < c && c < b && a < b || b < c && c < a && b < a;

        if (medA) {
            System.out.println(a + " is the median number");
        }
        if (medB) {
            System.out.println(b + " is the median number");
        }
        if (medC) {
            System.out.println(c + " is the median number");
        }


    }
}
/*
2. Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex:
        a = 10, b= 15, c = 20;
Output:
        15 is the median number
Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number
 */