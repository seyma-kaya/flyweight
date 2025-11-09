package org.example;

public class Book {
    String title;
    double price;
    BookType type;

    public Book(String title, double price, BookType type){
        this.title = title;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book { title: " + title + ", price: " + price + type + " }";
    }
}
