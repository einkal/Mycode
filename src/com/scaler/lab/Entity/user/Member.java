package com.scaler.lab.Entity.user;

public class Member extends User {
    private  int borrowedBooksCount;
    private final static int MAX_BORROW_LIMIT = 5;

    public Member(){
        super();
        borrowedBooksCount = 0;
    }
    public Member(String name, String contactInfo) {
        super(name, contactInfo);
        borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("userId: "+ this.getUserId());
        System.out.println("name: " + this.getName());
        System.out.println("contactInfo: "+ this.getContactInfo());
        System.out.println(" Books Borrowed: " +  this.borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return this.borrowedBooksCount < MAX_BORROW_LIMIT;
    }

    @Override
    public void returnBooks() {
        borrowedBooksCount--;
    }

}
