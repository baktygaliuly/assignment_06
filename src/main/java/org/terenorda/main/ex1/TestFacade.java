package org.terenorda.main.ex1;

public class TestFacade {
    public static void main(String[] args) {
        LibraryFacade facade = new LibrarySystemFacade();

        // Borrow a book
        boolean borrowed = facade.borrowBook("Clean Code", "Robert C. Martin", "John Doe");
        if (borrowed) {
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Failed to borrow the book.");
        }

        // Search for books
        String searchResult = facade.searchBooks("Clean Code");
        System.out.println("Search Result:\n" + searchResult);

        // Return a book
        boolean returned = facade.returnBook("Clean Code", "Robert C. Martin");
        if (returned) {
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Failed to return the book.");
        }
    }
}
