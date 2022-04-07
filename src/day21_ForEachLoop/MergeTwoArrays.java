package day21_ForEachLoop;

import java.sql.Array;
import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur"};
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String[] student =new String[group1.length+ group2.length];

        int i = 0;

        for (String each : group1) {
            student[i++] = each;
        }

        for (String each : group2) {
            student[i++] = each;
        }

        System.out.println(Arrays.toString(student));

        System.out.println("------------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] ch3 = new char[ch1.length+ ch2.length];

        int j = 0;
        for (char each : ch1) {
            ch3[j++]=each;
        }

        for (char each : ch2) {
            ch3[j++]=each;
        }

        System.out.println(Arrays.toString(ch3));





    }
}
