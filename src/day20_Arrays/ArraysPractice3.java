package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice3 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        for (char i = 'z', j = 0; i >= 'a' && j<26 ; i-- , j++) {
            letters[j] = i;
        }

        System.out.println(Arrays.toString(letters));
    }
}
