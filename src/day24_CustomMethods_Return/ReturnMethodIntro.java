package day24_CustomMethods_Return;

import static day24_CustomMethods_Return.WarmUpTasks.camelCase;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";

        System.out.println(reverse(str));

    }

    public static String reverse (String str){
        String result ="";

        for ( int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }

}
