package com.xworkz.app;

import com.xworkz.app.management.Theatre;
import com.xworkz.app.movie.Movie;

public class TheatreRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to PVR Theatre 🎥");

        Movie movie = new Movie();
        movie.setTitle("Inception");
        movie.setGenre("Sci-Fi");
        movie.setDirector("Christopher Nolan");
        movie.setDuration(148);
        movie.setLanguage("English");
        movie.setTicketPrice(250.0);
        movie.setReleaseDate("16-07-2010");

        Theatre theatre = new Theatre();
        boolean added = theatre.addMovie(movie);
        System.out.println("Movie added: " + added);

        if (added) {
            theatre.getMovieInfo();
        }
    }
}
