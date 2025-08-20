package com.xworkz.library.management;

import com.xworkz.library.app.Book;
import com.xworkz.library.validadtor.BookValidator;

public class Library {
    private Book book;

    public boolean addBook(Book book) {
        boolean added = false;

        BookValidator validator = new BookValidator();
        boolean isValid = validator.validateBookInfo(book);

        if (isValid) {
            this.book = book;
            added = true;
        }

        return added;
    }

    public void getBookInfo() {
        System.out.println("Book ID: " + book.getBookId());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Published On: " + book.getPublishedOn());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Price: " + book.getPrice());
    }
}
