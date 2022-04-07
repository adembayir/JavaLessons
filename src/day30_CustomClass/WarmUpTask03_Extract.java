package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask03_Extract {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!aski";
        String[] arr = str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        ArrayList<String> letters = new ArrayList<>(list);
        letters.removeIf(p -> !((p.charAt(0) >= 'A' && p.charAt(0) <= 'Z') || (p.charAt(0) >= 'a' && p.charAt(0) <= 'z')));
        System.out.println("letters = " + letters);

        ArrayList<String> numbers = new ArrayList<>(list);
        numbers.removeIf(p -> !(p.charAt(0) >= '0' && p.charAt(0) <= '9'));
        System.out.println("numbers = " + numbers);

        ArrayList<String> specChars = new ArrayList<>(list);
        specChars.removeAll(letters);
        specChars.removeAll(numbers);
        System.out.println("specChars = " + specChars);
    }
}
/*
3. Write a program that can extract the special characters, digits and letters from a string and stores them into
separate ArrayList of characters

        Ex:
            str = "ABCD123$%#@&456EFG!"

        output:
            list1: {1, 2, 3, 4, 5, 6}
            list2: {A, B, C, D, E, F, G}
            list3: {$, %, #, @, &, !}
 */