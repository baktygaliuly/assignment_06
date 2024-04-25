package org.terenorda.main.ex1;

import java.util.HashMap;
import java.util.Map;

public class UserManagementSystem {
    private Map<String, String> userBookMap;

    public UserManagementSystem() {
        this.userBookMap = new HashMap<>();
    }

    public boolean addBookToUser(String user, String title, String author) {
        String bookKey = title + " by " + author;
        userBookMap.put(user, bookKey);
        System.out.println("Added book '" + bookKey + "' to user: " + user);
        return true;
    }
}
