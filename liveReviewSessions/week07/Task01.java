package week07;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        int rowCount = 5;

        for (int row = 1; row <=5 ; row++) {

            int value = row;

            for ( int col = 1 ; col <= row; col++){
                System.out.print(value+" ");
                value += rowCount - col;
            }
            System.out.println();

        }





    }
}
/*
Print below pattern using loop
        rows    : 5
        columns : 5
            1
            2 (4) 6
            3 (4) 7 (3) 10
            4 (4) 8 (3) 11 (2) 13
            5 (4) 9 (3) 12 (2) 14 (1) 15
 */