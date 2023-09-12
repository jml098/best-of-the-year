package com.jaita91.bestoftheyear;

import java.time.LocalTime;

public class Song {
    private String name;
    private LocalTime duration;
    private Artist artist;


    public Song(String name,  LocalTime duration, Artist artist) {
        this.name = name;
        this.duration = duration;
        this.artist = artist;
    }

    public Song() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }
}
