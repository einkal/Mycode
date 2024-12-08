package com.scaler.lab.Entity;

import com.scaler.lab.Entity.book.Book;
import com.scaler.lab.Entity.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryManagementSystem {
    private List<Book> bookInventory;
    private List<User> registeredUsers;

    public LibraryManagementSystem() {
        bookInventory = new ArrayList<Book>();
        registeredUsers = new ArrayList<User>();
    }
    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    public List<Book> searchBooks(String criteria) {
        if (criteria == null || criteria.equals("")) {
            return new ArrayList<Book>();
        }

        return bookInventory.stream().filter(b ->
                        b.getAuthor().equalsIgnoreCase(criteria) ||
                                b.getTitle().equalsIgnoreCase(criteria))
                .collect(Collectors.toList());
    }

    public List<Book> searchBooks(String criteria, String type) {

        if (criteria == null || criteria.equals("")) {
            return new ArrayList<Book>();
        }

        List<Book> list = new ArrayList<Book>();
        for (Book b : bookInventory) {
            if ((b.getAuthor().equalsIgnoreCase(criteria) ||
                    b.getTitle().equalsIgnoreCase(criteria))
                    && b.getBooktype().equals(type)) {
                list.add(b);
            }
        }
        return list;

    }
}
