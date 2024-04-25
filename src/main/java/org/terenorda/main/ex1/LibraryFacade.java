package org.terenorda.main.ex1;

public interface LibraryFacade {
    boolean borrowBook(String title, String author, String user);
    boolean returnBook(String title, String author);
    String searchBooks(String query);
    boolean checkAvailability(String title, String author);
}
