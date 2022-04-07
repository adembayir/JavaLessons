package week08;

import java.util.Arrays;

public class SentenceSplit {

    public static void main(String[] args) {

        String searchResult = "1-16 of 829 results for ipad";

        //in my test cases, I want to verify that my search result comes over 500

        //split method turns your string into Array

        String[] words = searchResult.split(" ");

        System.out.println(Arrays.toString(words));

        String searchAmount = words[2];

        System.out.println("searchAmount = " + searchAmount);


        System.out.println("---------------------------------------------------------------");

        // Break time task : capture the amount 790 with split method
        String confirmation = "Id: 2239677\n" +
                "Amount: 790 USD\n"+
                "Card Number: 8548595959595\n"+
                "Name: oscar\n"+
                "Date: 11/10/2021";

        System.out.println("confirmation = " + confirmation);

        String[] splitted = confirmation.split(" ");
        System.out.println(Arrays.toString(splitted));
        System.out.println(splitted[2]);


    }
}
