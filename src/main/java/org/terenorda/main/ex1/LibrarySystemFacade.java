package org.terenorda.main.ex1;

public class LibrarySystemFacade implements LibraryFacade {
    private BookInventorySystem bookInventorySystem;
    private UserManagementSystem userManagementSystem;

    public LibrarySystemFacade() {
        this.bookInventorySystem = new BookInventorySystem();
        this.userManagementSystem = new UserManagementSystem();
    }

    @Override
    public boolean borrowBook(String title, String author, String user) {
        if (!checkAvailability(title, author)) {
            return false;
        }
        bookInventorySystem.borrowBook(title, author);
        userManagementSystem.addBookToUser(user, title, author);
        return true;
    }

    @Override
    public boolean returnBook(String title, String author) {
        return bookInventorySystem.returnBook(title, author);
    }

    @Override
    public String searchBooks(String query) {
        return bookInventorySystem.searchBooks(query);
    }

    @Override
    public boolean checkAvailability(String title, String author) {
        return bookInventorySystem.checkAvailability(title, author);
    }
}

