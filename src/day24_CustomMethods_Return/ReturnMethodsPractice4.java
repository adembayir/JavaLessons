package day24_CustomMethods_Return;

public class ReturnMethodsPractice4 {

    public static void main(String[] args) {

        String str = "AAAAAAAAAAAdddddddddeeeeeeeeem        BBBBBaaayırrrrr";

        System.out.println(removeDuplicates(str));


    }


    // 1. create a method that can remove duplciated characters from a string and returns the new value
     public static String removeDuplicates(String str){
        String result = "";

         for (int i = 0; i < str.length(); i++) {
             char each = str.charAt(i);

             if ( !(result.contains(""+each) ) ){
                 result+=each;
             }
         }

        return result;

     }


}
