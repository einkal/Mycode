package com.scaler.lab.Entity.items;

public class Book extends Item{

    private String author;

    public Book(String id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
