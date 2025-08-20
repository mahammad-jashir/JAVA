package com.xworkz.library.validadtor;

import com.xworkz.library.app.Book;

public class BookValidator {
    public boolean validateBookInfo(Book book) {
        boolean validated = false;

        boolean idValid = false;
        boolean titleValid = false;
        boolean authorValid = false;
        boolean genreValid = false;
        boolean pagesValid = false;
        boolean publishedOnValid = false;
        boolean publisherValid = false;
        boolean priceValid = false;

        if (book.getBookId() != null && !book.getBookId().isEmpty()) {
            idValid = true;
        } else System.out.println("Invalid book ID");

        if (book.getTitle() != null && !book.getTitle().isEmpty()) {
            titleValid = true;
        } else System.out.println("Invalid title");

        if (book.getAuthor() != null && !book.getAuthor().isEmpty()) {
            authorValid = true;
        } else System.out.println("Invalid author");

        if (book.getGenre() != null && !book.getGenre().isEmpty()) {
            genreValid = true;
        } else System.out.println("Invalid genre");

        if (book.getPages() > 0) {
            pagesValid = true;
        } else System.out.println("Invalid pages");

        if (book.getPublishedOn() != null && !book.getPublishedOn().isEmpty()) {
            publishedOnValid = true;
        } else System.out.println("Invalid published date");

        if (book.getPublisher() != null && !book.getPublisher().isEmpty()) {
            publisherValid = true;
        } else System.out.println("Invalid publisher");

        if (book.getPrice() > 0) {
            priceValid = true;
        } else System.out.println("Invalid price");

        if (idValid && titleValid && authorValid && genreValid
                && pagesValid && publishedOnValid && publisherValid && priceValid) {
            validated = true;
        }

        return validated;
    }
}
