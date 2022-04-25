package day15_ForLoop;

import java.util.ArrayList;
import java.util.Scanner;
class Main {

    public static int getDup(String[] r) {

        ArrayList<String> rList = new ArrayList<>();


        int result = 0;


        for (String each : r) {
            int count = 0;
            for (String each2 : r) {
                if(rList.contains(each)){
                    continue;
                }
                if(each.equals(each2)){
                    count++;
                }
            }
            if (count > 1) {
                result += count;
            }
            rList.add(each);
        }



        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

}