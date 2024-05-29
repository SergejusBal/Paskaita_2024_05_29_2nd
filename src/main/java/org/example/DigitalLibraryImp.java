package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DigitalLibraryImp implements DigitalLibrary {
    private List<String> books;

    public DigitalLibraryImp() {
        this.books = new ArrayList<>();
    }


    public void addBook(String book) {
        if (book != null && !book.trim().isEmpty()) {
            books.add(book);
        }
    }

    public List<String> getAllBooks() {
        return books;
    }

    public List<String> searchBooks(String query) {
        return books.stream()
                .filter(book -> book.toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }


    public int getBookCount() {
        return books.size();
    }


    public boolean isBookAvailable(String title) {
        return books.contains(title);
    }

    public boolean updateBookTitle(String oldTitle, String newTitle) {
        int index = books.indexOf(oldTitle);
        if (index != -1 && newTitle != null && !newTitle.trim().isEmpty()) {
            books.set(index, newTitle);
            return true;
        }
        return false;
    }

    public boolean removeBook(String title) {
        return books.remove(title);
    }
}
