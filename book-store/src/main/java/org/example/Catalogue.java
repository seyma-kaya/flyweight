package org.example;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, double price, String type, String distributor, BufferedImage logo){
        books.add(new Book(title, price, type, distributor, logo));
    }

    public void displayAllBooks(){
        for ( Book b : books ) {
            System.out.println(b.toString());
        }
    }
}
