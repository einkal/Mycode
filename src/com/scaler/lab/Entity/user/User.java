package com.scaler.lab.Entity.user;

public abstract class User {
        private String userId;
        private  String name;
        private String contactInfo;
        private static int totalUsers = 0;

        public User() {
            this.userId = String.valueOf(generateUniqueId());
        }

        public User(String name, String contactInfo) {
            this.name = name;
            this.contactInfo = contactInfo;
        }

        public User(User user) {
            this.userId = generateUniqueId();
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

    public final String generateUniqueId() {
            return "User-"+ ++totalUsers;
        }
    public int getTotalUsers(){
            return totalUsers;
        }
    public abstract void displayDashboard() ;
    public abstract boolean canBorrowBooks();
    public abstract void returnBooks();

}
