package com.scaler.lab.Entity.user;

import com.scaler.lab.Entity.book.Book;

public class Librarian extends User {

    private String employeeNumber;

    public Librarian(String employeeNumber, String name, String contactInfo) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("User Id: "+ this.getUserId());
        System.out.println("Name: " + this.getName());
        System.out.println("Contact Info: "+ this.getContactInfo());
        System.out.println("Employee Number: " +  this.employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    @Override
    public void returnBooks() {

    }

    public void addNewBook(Book book) {

    }

    void removeBook(Book book) {

    }
}
