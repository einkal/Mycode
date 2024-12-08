package com.scaler.lab.Entity.book;

public class TextBook extends Book {
    private String subject;
    private int edition;

    @Override
    public void displayBookDetails() {
        System.out.println("Book Details");
        System.out.println("Subject: " + subject);
        System.out.println("Edition: " + edition);
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());

    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }

    public TextBook(String isbn, String title, String author, String subject, int edition, BOOKTYPE bookType) {
        super(isbn, title, author, bookType );
        this.subject = subject;
        this.edition = edition;
    }
}
