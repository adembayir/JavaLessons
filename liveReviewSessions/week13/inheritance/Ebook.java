package week13.inheritance;

public class Ebook extends Book{

    double size;
    String inkType;

    public void readBook() {
        System.out.println("Reading e-book of " + title);
    }
}
