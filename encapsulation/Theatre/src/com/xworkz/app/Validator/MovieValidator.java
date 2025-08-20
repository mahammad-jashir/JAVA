package com.xworkz.app.Validator;

import com.xworkz.app.movie.Movie;

public class MovieValidator {
    public boolean validateMovie(Movie movie) {
        boolean validated = false;

        boolean titleValid = false;
        boolean genreValid = false;
        boolean directorValid = false;
        boolean durationValid = false;
        boolean languageValid = false;
        boolean priceValid = false;
        boolean dateValid = false;

        if (movie.getTitle() != null && !movie.getTitle().isEmpty()) {
            titleValid = true;
        } else System.out.println("Invalid Movie Title");

        if (movie.getGenre() != null && !movie.getGenre().isEmpty()) {
            genreValid = true;
        } else System.out.println("Invalid Genre");

        if (movie.getDirector() != null && !movie.getDirector().isEmpty()) {
            directorValid = true;
        } else System.out.println("Invalid Director");

        if (movie.getDuration() > 30) { // minimum 30 mins
            durationValid = true;
        } else System.out.println("Invalid Duration");

        if (movie.getLanguage() != null && !movie.getLanguage().isEmpty()) {
            languageValid = true;
        } else System.out.println("Invalid Language");

        if (movie.getTicketPrice() > 0) {
            priceValid = true;
        } else System.out.println("Invalid Ticket Price");

        if (movie.getReleaseDate() != null && !movie.getReleaseDate().isEmpty()) {
            dateValid = true;
        } else System.out.println("Invalid Release Date");

        if (titleValid && genreValid && directorValid && durationValid &&
                languageValid && priceValid && dateValid) {
            validated = true;
        }

        return validated;
    }
}
