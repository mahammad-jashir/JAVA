package com.xworkz.library;

import com.xworkz.library.app.Book;
import com.xworkz.library.management.Library;

public class LibrarRunner {
    public static void main(String[] args) {
        System.out.println("Library system started...");

        Book book = new Book();
        book.setBookId("B101");
        book.setTitle("Java Programming");
        book.setAuthor("James Gosling");
        book.setGenre("Programming");
        book.setPages(450);
        book.setPublishedOn("2000");
        book.setPublisher("Sun Microsystems");
        book.setPrice(599.50);

        Library library = new Library();
        boolean added = library.addBook(book);
        System.out.println("Book added: " + added);

        if (added) {
            library.getBookInfo();
        }
    }
}
