package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada", "New Zealand"};

        // converting array to ArrayList
        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList(countries));

        countryNames.removeIf(p -> p.length() >= 10);

        System.out.println(countryNames);

        //converting ArrayList back to array

        countries = countryNames.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));





    }


}
/*
    1. Create an Array of String called countries

    2. Write a program that can remove all the country names that have length of 10 or greater
 */