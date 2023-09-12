package com.jaita91.bestoftheyear;

public class Artist {
    private String name;
    private String image;


    public Artist(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public Artist() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
