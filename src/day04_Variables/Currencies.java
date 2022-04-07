package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 13.44;
        double euro = dollar * 0.88;
        double jpy = dollar * 114.62;
        double pound = dollar * 0.73;
        double CAD = dollar * 1.25;

        System.out.println("dollar = " + dollar);
        System.out.println(dollar +" dollar equal to " + lira + " lira.");
        System.out.println(dollar +" dollar equal to " + euro + " euro.");
        System.out.println(dollar +" dollar equal to " + jpy +" jpy." );
        System.out.println(dollar +" dollar equal to " + pound +" pound." );
        System.out.println(dollar +" dollar equal to " + CAD +" CAD." );

    }
}
