package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        for (int i =15; i <=45 ; i++){ // 15 16 17 18 ... 45
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for ( int i= 100 ; i >= 50 ; i--){ // i:100, 99, 98, ... 51, 50
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        // print all even numbers between 1~55

        for (int i = 2; i <= 54; i += 2){ // i : 2, 4, 6, 8, ... 52, 54
            System.out.print(i+" ");
        }
        System.out.println();

        for ( int i =1; i <= 55; i++ ){
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for ( char i = 'A'; i <= 'Z'; i++){
            System.out.print(i+", ");
        }
        System.out.println();

        for ( char i = 'z'; i >= 'a'; i--){
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------");

        for (char i = 1; i <= 40000; i++){
            System.out.print(i+" ");
        }



    }
}
