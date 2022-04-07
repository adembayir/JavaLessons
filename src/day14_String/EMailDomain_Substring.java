package day14_String;

public class EMailDomain_Substring {

    public static void main(String[] args) {

        String eMail = "adembyr@hotmail.com";

        String domain = eMail.substring(eMail.indexOf("@")+1 , eMail.lastIndexOf("."));

        System.out.println(domain);

        System.out.println("-------------------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0,11); //Java is fun
        System.out.println(s1);

        String s2 = str1.substring(str1.indexOf(" J")+1 , str1.lastIndexOf(",")); //Java is cool
        System.out.println(s2);

        String s3 = str1.substring(str1.lastIndexOf("I"));//I love Java
        System.out.println(s3);


    }
}
/*
Find the domain of given e-mail address.
 */