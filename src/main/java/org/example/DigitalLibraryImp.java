package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DigitalLibraryImp implements DigitalLibrary {
    private List<String> books;

    private Map<String, Integer> bookFrequency;

    public DigitalLibraryImp() {

        this.books = new ArrayList<>();
        this.bookFrequency = new HashMap<>();

    }


    public void addBook(String book) {
        if (book != null && !book.trim().isEmpty()) {
            books.add(book);
        }
    }

    public List<String> getAllBooks() {
        return books;
    }
    public Map<String, Integer> getBookFrequencyList() {
        return bookFrequency;
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

    public void countBookDublications(){
        for(int i = 0; i < books.size(); i++){
            if(bookFrequency.containsKey(books.get(i))) continue;
            bookFrequency.put(books.get(i),searchBooks(books.get(i)).size());
        }
    }
}
