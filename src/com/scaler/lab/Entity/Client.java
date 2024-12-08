package com.scaler.lab.Entity;

import com.scaler.lab.Entity.book.BOOKTYPE;
import com.scaler.lab.Entity.book.Book;
import com.scaler.lab.Entity.book.NovelBook;
import com.scaler.lab.Entity.book.TextBook;
import com.scaler.lab.Entity.user.Librarian;
import com.scaler.lab.Entity.user.Member;
import com.scaler.lab.Entity.user.User;

public class Client {
    public static void main(String[] args) {
        Book b1 =new TextBook("123","Java Programming", "Schildt", "Programming", 2, BOOKTYPE.TEXTBOOK);
        Book b2 =new TextBook("345","C Programming", "Robert", "Programming", 2, BOOKTYPE.TEXTBOOK);
        Book b3 =new NovelBook("546","Mind and Brain", "Julia", "Drama", BOOKTYPE.NOVELBOOK);

        LibraryManagementSystem lms = new LibraryManagementSystem();
        lms.addBook(b1);
        lms.addBook(b2);
        lms.addBook(b3);

        User user1 = new Member("Robert", "abc@gmail.com");
        User user2 = new Member("Ronald", "ronald@gmail.com");
        User user3 = new Librarian("emp123","Ronald", "ronald@gmail.com");
        lms.registerUser(user1);
        lms.registerUser(user2);
        lms.registerUser(user3);

        if(b1.lend(user1)){
            System.out.println("Successfully lended ");
        }

        if(b1.lend(user2)){
            System.out.println("Successfully lended ");
        } else {
            System.out.println("Failed to lended ");
        }

        b1.returnBook(user1);


        if(b1.lend(user2)){
            System.out.println("Successfully lended ");
        } else {
            System.out.println("Failed to lended ");
        }
    }
}
