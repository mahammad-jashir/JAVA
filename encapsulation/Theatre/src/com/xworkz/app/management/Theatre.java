package com.xworkz.app.management;

import com.xworkz.app.Validator.MovieValidator;
import com.xworkz.app.movie.Movie;

public class Theatre {
    private Movie movie;

    public boolean addMovie(Movie movie) {
        boolean added = false;

        MovieValidator validator = new MovieValidator();
        boolean isValid = validator.validateMovie(movie);

        if (isValid) {
            this.movie = movie;
            added = true;
        }
        return added;
    }

    public void getMovieInfo() {
        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Director: " + movie.getDirector());
        System.out.println("Duration: " + movie.getDuration() + " minutes");
        System.out.println("Language: " + movie.getLanguage());
        System.out.println("Ticket Price: ₹" + movie.getTicketPrice());
        System.out.println("Release Date: " + movie.getReleaseDate());
    }
}
