package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'F' ; i++) {

            if (i == 'C'){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------------------");

        for (int i = 1; i <= 10; i++) {  // print all even numbers between 1-10

            if( i%2 != 0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------------------");

        for (int i = 1; i <= 10 ; i++) { // print all odd numbers between 1-10

            if ( i%2 == 0){
                continue;
            }

            System.out.println(i);

        }


    }
}
