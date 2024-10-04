package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class LibraryTest {

    @Test
    public void testAddBook(){
        Library library = new Library();
        library.addBook("New Book");
        assertTrue(library.isBookAvailable("New Book"));
    }

    @Test
    public void tesRemoveBook() {
        Library library = new Library();
        library.addBook("New Book");
        library.removeBook("New Book");
        assertFalse(library.isBookAvailable("New Book"));
    }

    @Test
    public void testIsBookAvailable(){
        Library library = new Library();
        library.addBook("New Book");
        assertTrue(library.isBookAvailable("New Book"));
    }

    @Test
    public void testBookNotAvailable(){
        Library library = new Library();
        assertFalse(library.isBookAvailable("New book"));
    }

    @Test
    public void testGetBooks(){
        Library library = new Library();
        library.addBook("New Book 1");
        library.addBook("New Book 2");
        library.addBook("New Book 3");
        library.addBook("New Book 4");
        List<String> books = library.getBooks();
        assertTrue(books.contains("New Book 1"));
        assertTrue(books.contains("New Book 2"));
        assertTrue(books.contains("New Book 3"));
        assertTrue(books.contains("New Book 4"));
    }
    
}
