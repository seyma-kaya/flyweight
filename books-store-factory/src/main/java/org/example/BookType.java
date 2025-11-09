package org.example;

import java.awt.image.BufferedImage;

public class BookType {
    String type;
    String distributor;
    BufferedImage logo;

    public BookType(String type, String distributor, BufferedImage logo){
        this.type = type;
        this.distributor = distributor;
        this.logo = logo;
    }

    @Override
    public String toString() {
        return ", type: " + type + ", distributor: " + distributor + ", logo: " + logo;
    }
}
