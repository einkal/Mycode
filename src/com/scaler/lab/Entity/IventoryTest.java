package com.scaler.lab.Entity;

import com.scaler.lab.Entity.inventory.Inventory;
import com.scaler.lab.Entity.items.Clothing;
import com.scaler.lab.Entity.items.Item;

public class IventoryTest {
    public static void main(String[] args) {
        Inventory<Clothing> inventory = new Inventory<>();
        Clothing clothing =  new Clothing("1","Tshirt",320.00,5,"XL");
        Clothing clothing1 = new Clothing("2","Jeans",320.00,5,"L");
        inventory.addItem(clothing1);
        inventory.addItem(clothing);

        for (Item item: inventory.getAllItems()) {
            System.out.println(item.getName());
        }

        System.out.println(inventory.getItem("1").getName());

        inventory.removeItem("1");

        for (Item item: inventory.getAllItems()) {
            System.out.println(item.getName());
        }

    }
}
