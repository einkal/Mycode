package com.scaler.lab.Entity.user;

import com.scaler.lab.Entity.book.Book;

public class Librarian extends User {

    private String employeeNumber;

    @Override
    public void displayDashboard() {
        System.out.println("User Id: "+ this.getUserId());
        System.out.println("Name: " + this.getName());
        System.out.println("Contact Info: "+ this.getContactInfo());
        System.out.println("Employee Number: " +  this.employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book) {

    }

    void removeBook(Book book) {

    }
}
