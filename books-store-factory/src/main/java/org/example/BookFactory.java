package org.example;

import java.awt.image.BufferedImage;
import java.util.HashMap;

public class BookFactory {
    private static HashMap<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, BufferedImage logo){
        if (bookTypes.get(type) == null){
            bookTypes.put(type, new BookType(type, distributor, logo));
        }
        return bookTypes.get(type);
    }
}
