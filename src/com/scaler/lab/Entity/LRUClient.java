package com.scaler.lab.Entity;

import com.scaler.lab.Entity.items.Clothing;
import com.scaler.lab.Entity.items.Item;
import com.scaler.lab.Entity.items.LRUCache;

public class LRUClient {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        Clothing clothing = new Clothing("Item1","Tshirt", 300.00,5,"XL");
        Clothing clothing2 = new Clothing("Item2","Jeans", 300.00,5,"XL");
        Clothing clothing3 = new Clothing("Item3","Dress", 300.00,5,"XL");
        lruCache.addRecentlyViewedItem(clothing);
        lruCache.addRecentlyViewedItem(clothing2);
        System.out.println("Items Present");
        for (Item item: lruCache.getMap().values()) {
            System.out.println(item.getName());
        }
        System.out.println("--------------------------");

        lruCache.addRecentlyViewedItem(clothing);
        System.out.println("Items Present");
        for (Item item: lruCache.getMap().values()) {
            System.out.println(item.getName());
        }

        System.out.println("--------------------------");

        lruCache.addRecentlyViewedItem(clothing3);
        System.out.println("Items Present");
        for (Item item: lruCache.getMap().values()) {
            System.out.println(item.getName());
        }

    }
}
