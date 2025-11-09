package org.example;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Book {
    private String title;
    private double price;
    private String type;
    private String distributor;
    private BufferedImage logo;

    public Book(String title, double price, String type, String distributor, BufferedImage logo){
        this.title = title;
        this.price = price;
        this.type = type;
        this.distributor = distributor;
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Book { title: " + title + ", price: " + price + ", type: " + type + ", distributor: " + distributor + ", logo: " + logo + " }";
    }
}
