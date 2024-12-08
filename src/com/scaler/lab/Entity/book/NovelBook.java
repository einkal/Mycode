package com.scaler.lab.Entity.book;

public class NovelBook extends Book {

    private String genre;

    public NovelBook(String isbn, String title, String author, String genre, BOOKTYPE  bookType) {
        super(isbn, title, author, bookType);
        this.genre = genre;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("Novel Details");
        System.out.println(genre);
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
    }

    public String getGenre() {
            return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
