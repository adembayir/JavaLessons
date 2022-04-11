package week13.inheritance;

public class Book {
    String title; //default access modifier
    String type;
    String author;
    double price;

    public void buy() {
        System.out.println("Buy this product");
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
