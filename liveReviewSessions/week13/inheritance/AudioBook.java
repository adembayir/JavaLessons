package week13.inheritance;

public class AudioBook extends Book {
    int length;
    String narrator;

    public void listen() {
        System.out.println("listening to audiobook of" + title);
    }


}
