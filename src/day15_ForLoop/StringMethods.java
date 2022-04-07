package day15_ForLoop;

public class StringMethods {

    public static void main(String[] args) {

        String str = "";

        boolean r = str.isEmpty();
        boolean b = str.isBlank();

        System.out.println("r = " + r);
        System.out.println("b = " + b);

        System.out.println("----------------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));

        System.out.println("----------------------------------------------------------");

        String sentence = " My favorite programming language is Java";

        boolean r1 = sentence.contains("Java");
        boolean r2 = sentence.contains("C#");

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("----------------------------------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); //false
        System.out.println(input1.contains(input2)); //true

        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

    }
}
