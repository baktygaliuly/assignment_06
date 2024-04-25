package org.terenorda.main.ex1;

import java.util.HashMap;
import java.util.Map;

public class BookInventorySystem {
    private Map<String, Integer> bookInventory;

    public BookInventorySystem() {
        this.bookInventory = new HashMap<>();
        // Initialize some sample books in the inventory
        bookInventory.put("Clean Code by Robert C. Martin", 5);
        bookInventory.put("Design Patterns by Erich Gamma", 3);
        bookInventory.put("The Pragmatic Programmer by Andrew Hunt", 7);
    }

    public boolean borrowBook(String title, String author) {
        String bookKey = title + " by " + author;
        if (bookInventory.containsKey(bookKey)) {
            int availableCopies = bookInventory.get(bookKey);
            if (availableCopies > 0) {
                bookInventory.put(bookKey, availableCopies - 1);
                System.out.println("Borrowed: " + bookKey);
                return true;
            } else {
                System.out.println("Sorry, no copies available for: " + bookKey);
            }
        } else {
            System.out.println("Book not found: " + bookKey);
        }
        return false;
    }

    public boolean returnBook(String title, String author) {
        String bookKey = title + " by " + author;
        if (bookInventory.containsKey(bookKey)) {
            int availableCopies = bookInventory.get(bookKey);
            bookInventory.put(bookKey, availableCopies + 1);
            System.out.println("Returned: " + bookKey);
            return true;
        } else {
            System.out.println("Book not found: " + bookKey);
            return false;
        }
    }

    public String searchBooks(String query) {
        StringBuilder result = new StringBuilder();
        for (String book : bookInventory.keySet()) {
            if (book.toLowerCase().contains(query.toLowerCase())) {
                result.append(book).append("\n");
            }
        }
        if (result.length() == 0) {
            result.append("No books found matching the query: ").append(query);
        }
        return result.toString();
    }

    public boolean checkAvailability(String title, String author) {
        String bookKey = title + " by " + author;
        return bookInventory.containsKey(bookKey) && bookInventory.get(bookKey) > 0;
    }
}

