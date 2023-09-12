package com.jaita91.bestoftheyear;

public class Movie {
    private String name;
    private String image;
    private String plot;
    private Actor[] cast;

    public Movie(String name, String image, String plot, Actor[] cast) {
        this.name = name;
        this.image = image;
        this.plot = plot;
        this.cast = cast;
    }

    public Movie() {
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

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public Actor[] getCast() {
        return cast;
    }

    public void setCast(Actor[] cast) {
        this.cast = cast;
    }
}
