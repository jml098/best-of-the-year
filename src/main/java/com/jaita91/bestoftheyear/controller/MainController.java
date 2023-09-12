package com.jaita91.bestoftheyear.controller;

import com.jaita91.bestoftheyear.Actor;
import com.jaita91.bestoftheyear.Artist;
import com.jaita91.bestoftheyear.Movie;
import com.jaita91.bestoftheyear.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("userName", "Jean");
        return "index";
    }

    @GetMapping("movies")
    public String movies(Model model) {
        model.addAttribute("movies", getMovies());
        return "movies";
    }

    @GetMapping("songs")
    public String songs(Model model) {

        model.addAttribute("songs", getSongs());

        return "songs";
    }


    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(
                "Interstellar",
                "interstellar.jpg",
                "Interstellar is a 2014 epic science fiction film co-written, directed, and produced by Christopher Nolan. It stars Matthew McConaughey, Anne Hathaway, Jessica Chastain, Bill Irwin, Ellen Burstyn, Matt Damon, and Michael Caine. Set in a dystopian future where humanity is embroiled in a catastrophic blight and famine, the film follows a group of astronauts who travel through a wormhole near Saturn in search of a new home for humankind.",
                new Actor[] {new Actor("Matthew", "McConaughey"), new Actor("Jessica", "Chastain"), new Actor("Anne", "Hathaway")}));

        movies.add(new Movie(
                "Inception",
                "inception.jpg",
                "Inception is a 2010 science fiction action film[4][5][6] written and directed by Christopher Nolan, who also produced the film with Emma Thomas, his wife. The film stars Leonardo DiCaprio as a professional thief who steals information by infiltrating the subconscious of his targets. He is offered a chance to have his criminal history erased, as payment for the implantation of another person's idea into a target's subconscious.[7] The ensemble cast includes Ken Watanabe, Joseph Gordon-Levitt, Marion Cotillard, Elliot Page,[a] Tom Hardy, Cillian Murphy, Tom Berenger, Dileep Rao and Michael Caine.",
                new Actor[] {new Actor("Leonardo", "Di Caprio"), new Actor("Cillian", "Murphy"), new Actor("Tom", "Hardy")}));

        movies.add(new Movie(
                "The Wolf of Wall Street",
                "the-wolf-of-wall-street.jpg",
                "The Wolf of Wall Street is a 2013 American epic biographical black comedy crime film co-produced and directed by Martin Scorsese and written by Terence Winter, based on Jordan Belfort's 2007 memoir of the same name. It recounts Belfort's career as a stockbroker in New York City and how his firm, Stratton Oakmont, engaged in rampant corruption and fraud on Wall Street, leading to his downfall. Leonardo DiCaprio, who was also a producer of the film, stars as Belfort in his fifth collaboration with Scorsese following Gangs of New York (2002), The Aviator (2004), The Departed (2006) and Shutter Island (2010). The film also stars Jonah Hill as his business partner and friend Donnie Azoff, Margot Robbie as his second wife, Naomi Lapaglia, and Kyle Chandler as FBI agent Patrick Denham.",
                new Actor[] {new Actor("Leonardo", "Di Caprio"), new Actor("Jonah", "Hill"), new Actor("Margot", "Robbie")}));


        return movies;
    }

    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(
                "Red Lips",
                LocalTime.of(0, 3, 38),
                new Artist("Skrillex", "skrillex.jpg")));

        songs.add(new Song(
                "I Was Never There",
                LocalTime.of(0, 2, 42),
                new Artist("The Weeknd", "the-weeknd.jpg")));

        songs.add(new Song(
                "bad guy",
                LocalTime.of(0, 3, 38),
                new Artist("Billie Ellish", "billie-ellish.jpg")));

        return songs;
    }

}
