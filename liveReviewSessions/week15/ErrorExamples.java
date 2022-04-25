package week15;

public class ErrorExamples {

    /*
    Normally we don't try to catch ERROR like the one below. We try to prevent to error
     */

    public static void main(String[] args) {

        try {
            deathlyMethod();
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }


    }

    static int counter = 0;

    public static void deathlyMethod() {
        System.out.println(counter++);
        deathlyMethod(); // We have infinite loop in this method.
    }
}
