package module1week3.shop;

public class Book extends Product {
    private String author;

    public Book(int id, double price, String name, String author) {
        super(id, price, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
