package com.scaler.lab.Entity.book;

import com.scaler.lab.Entity.user.User;

    public interface Lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();

}
