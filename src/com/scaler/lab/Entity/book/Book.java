package com.scaler.lab.Entity.book;

import com.scaler.lab.Entity.user.User;

public abstract class Book implements Lendable {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public  Book() {
        this.isAvailable = true;
    }

    public Book(Book book){
        this.isAvailable = book.isAvailable;
        this.title = book.title;
        this.author = book.author;
        this.isbn = book.isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;

    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public boolean lend(User user) {
        if(this.isAvailable) {
            this.setAvailable(false);
            return true;
        }
        return false;
    }

    public void returnBook(User user){
        this.setAvailable(true);
    }

    public abstract void displayBookDetails();
}
