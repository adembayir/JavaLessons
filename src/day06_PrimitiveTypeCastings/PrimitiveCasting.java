package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //short b = (short) a;
        //        (short)a

        int c = b; //implicit casting
        // int c = (int)b

        long d = c;

        int z = 60000;
        byte x = (byte)z;
        System.out.println(x);

        double d1 = 20.5;
        short s1 =  (short) d1;
    }
}
