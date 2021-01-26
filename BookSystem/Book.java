package BookSystem;

public class Book {
    private String name;
    private String author;
    private double price;
    private String type;
    private boolean isBorrowed = false;

    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
}
