package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        // replace(oldValue, newValue);

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java","Python");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo","gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence = sentence.replace(" Python","");
        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat");

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#"," Java");
        System.out.println(s2);

        String result = "Java Java Java ";
        result = result.replaceFirst("Java","Jinx");
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);


    }
}
