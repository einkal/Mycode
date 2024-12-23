package com.scaler.lab.Entity.user;

import com.scaler.lab.Entity.items.Book;
import com.scaler.lab.Entity.items.Clothing;
import com.scaler.lab.Entity.items.Electronics;
import com.scaler.lab.Entity.items.Item;

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

    }
}
