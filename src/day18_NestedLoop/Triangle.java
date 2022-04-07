package day18_NestedLoop;

public class Triangle {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print( "* ".repeat(i));
                break;

                }
            System.out.println();
        }


    }

}

