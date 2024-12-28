package com.scaler.lab.Entity.inventory;

import com.scaler.lab.Entity.items.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory<T extends Item> {
    private HashMap<String, T> items;
    public Inventory(){
    this.items = new HashMap();
    }
    public Inventory(HashMap<String, T> items){
        this.items = items;
    }
    public HashMap<String, T> getItems() {
        return items;
    }
    public void setItems(HashMap<String, T> items) {
        this.items = items;
    }
    public void addItem(T item){
        items.put(item.getId(), item);
    }

    public List<T> filterByPriceRange(double minPrice, double maxPrice) {
        return items.values().stream().filter(item -> item.getPrice() >= minPrice && item.getPrice() <= maxPrice)
               .collect(Collectors.toList());
    }

    public List<T> filterByAvailability() {
        return items.values().stream().filter(item -> item.getQuantity() > 0).collect(Collectors.toList());
    }

    public T removeItem(String id){
        return items.remove(id);
    }

    public T getItem(String id){
        return items.get(id);
    }

    public List<T> getAllItems() {
        return new ArrayList<T>(items.values());
    }


}

