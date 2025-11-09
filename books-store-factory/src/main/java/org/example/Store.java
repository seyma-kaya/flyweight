package org.example;

import javax.imageio.ImageIO;
import java.io.File;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Store {
    private static Random generator = new Random();
    // list for the book titles
    private static String[] titles = {"Together", "Stormy Sunday", "Sunny Afternoon", "Cupid Stupid", "Cool as Ice", "The Letter"};
    private static final int BOOKS_TO_INSERT = 4000;
    private static final int BOOK_TYPES = 2;

    public static void main( String[] args ) {
        Catalogue catalogue = new Catalogue();

        for (int i = 0; i < BOOKS_TO_INSERT / BOOK_TYPES; i++) {
            try {
                catalogue.addBook(getRandomTitle(), getRandomPrice(), "Fantasy", "Distributor A", ImageIO.read(new File("src/main/resources/fantasy.png")));
            } catch (Exception e) {
                System.out.println("Logo not found");
            }
        }

        for (int i = 0; i < BOOKS_TO_INSERT / BOOK_TYPES; i++) {
            try {
                catalogue.addBook(getRandomTitle(), getRandomPrice(), "Sci-Fi", "Distributor B", ImageIO.read(new File("src/main/resources/scifi.png")));
            } catch (Exception e) {
                System.out.println("Logo not found");
            }
        }

        catalogue.displayAllBooks();

    }

    public static String getRandomTitle(){
        int index = generator.nextInt(titles.length);
        return titles[index];
    }

    public static double getRandomPrice(){
        return generator.nextDouble(20);
    }
}
