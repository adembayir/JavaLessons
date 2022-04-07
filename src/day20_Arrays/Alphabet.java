package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabet = new char[26]; // Z~A

        char j = 'Z';

        for (int i = 0; i < alphabet.length; i++) {

            alphabet[i] = j--;

            System.out.print(alphabet[i]);

        }
        System.out.println();
        System.out.println(Arrays.toString(alphabet));




    }
}
