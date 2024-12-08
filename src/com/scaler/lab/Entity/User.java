package com.scaler.lab.Entity;

public abstract class User {
        private String userId;
        private  String name;
        private String contactInfo;
        private static int totalUsers;

        User() {
            this.userId = String.valueOf(generateUniqueId());
        }

        User(String name, String contactInfo) {
            this.name = name;
            this.contactInfo = contactInfo;
        }

        User(User user) {
            this.userId = String.valueOf(generateUniqueId());
            this.name = user.name;
            this.contactInfo = user.contactInfo;
        }

    public String getUserId() {
        return userId;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setName(String name) {
            this.name = name;
    }

    public final int generateUniqueId() {
            return 0;
        }
    public int getTotalUsers(){
            return totalUsers;
        }
    public abstract void displayDashboard() ;
    public abstract boolean canBorrowBooks();

}
