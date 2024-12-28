package com.scaler.lab.Entity;

import com.scaler.lab.Entity.items.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientItem {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        Clothing  clothing = new Clothing("Item1","Tshirt", 300.00,5,"XL");
        items.add(clothing);

        Book book = new Book("Item2", "Java", 200.00,4);
        items.add(book);

        Electronics electronics = new Electronics("Item3", "Laptop", 50000.00,5, 2);
        items.add(electronics);

        Collections.sort(items);

        for (Item item : items) {
            System.out.println(item.getName());
        }

        WishList wishList = new WishList();

        Book java = new Book("1", "Java", 2000.00, 3);
        wishList.addToWishlist(java);
        wishList.addToWishlist(new Book("2","C Programming", 2500.00,15));
        wishList.addToWishlist(new Book("3","Java", 1800,10));

        for (Item item : wishList.getWishListItems()) {
            System.out.println(item.getName());
        }

        wishList.removeFromWishlist(java);

        for (Item item : wishList.getWishListItems()) {
            System.out.println(item.getName());
        }
    }
}
