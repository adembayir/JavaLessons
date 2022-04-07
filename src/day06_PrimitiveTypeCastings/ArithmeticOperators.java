package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10 + 20);
        System.out.println(100 - 50);
        System.out.println(10 * 6);
        System.out.println(100 / 3); //33
        System.out.println(10.0/4);//2.5
        System.out.println(10/4.0);//2.5
        System.out.println(10d/4); //2.5

        int a = 100;
        double b = a/6; //16.0
        System.out.println(b);

        double c = a/6.0; //16.66666
        System.out.println(c);
        double d = a/6d; //16.66666
        System.out.println(c);
        double e = (double) a/6; //16.66666
        System.out.println(c);

    }
}
/*
    +:  Addition
    -:  Subtraction
    *:  Multiplication
    /:  Division

            integer/integer ====> integer
            decimal/integer ====> decimal
            integer/decimal ====> decimal
            decimal/decimal ====> decimal

            in math:
                    10/4 = 2.5
                    100/3 = 33.3333
            in java:
                    10/4 = 2
                    100/3 = 33
    %: Remainder
 */