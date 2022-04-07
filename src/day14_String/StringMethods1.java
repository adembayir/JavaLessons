package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "      batch 25        ";
        str1 = str1.trim();

        System.out.println(str1);

        String str2 = "Cydeo School";

        int n1 = str2.indexOf('h');
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("ang");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("gua");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);

        System.out.println("--------------------------------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf('a');
        System.out.println("firstA = " + firstA);

        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

        // int fourthA = s.indexOf("ava W");
        // int fourthA = s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        System.out.println("forthA = " + fourthA);

        // int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.lastIndexOf("a W") + 1;
        System.out.println("fifthA = " + fifthA);

        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);

        // int seventhA = s.lastIndexOf("a ");
        int seventhA = s.indexOf("a o");
        System.out.println("seventhA = " + seventhA);

        int lastA = s.lastIndexOf('a');
        System.out.println("lastA = " + lastA);

    }
}
