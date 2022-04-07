package day29_ArrayList;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeefaiiiiiiiiijkkkkkkkccckckcl";

        // str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(list);

        String unique = "";

        for (String each : list) {
            if ( Collections.frequency(list, each) == 1 ){
                unique += each;
            }
        }

        System.out.println(unique);
    }
}
