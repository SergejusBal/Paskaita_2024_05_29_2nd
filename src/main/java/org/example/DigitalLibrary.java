package org.example;

import java.util.List;

public interface DigitalLibrary {

    void addBook(String book);
    List<String> getAllBooks();
    List<String> searchBooks(String query);
    int getBookCount();
    boolean isBookAvailable(String title);
    boolean updateBookTitle(String oldTitle, String newTitle);
    boolean removeBook(String title);

}
