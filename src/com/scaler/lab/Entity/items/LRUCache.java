package com.scaler.lab.Entity.items;

import java.util.LinkedHashMap;

public class LRUCache {
    private int maxSize;
    private LinkedHashMap<String,Item > map;

    public LRUCache(int maxSize){
        this.maxSize = maxSize;
        this.map = new LinkedHashMap<>();
    }

    public void addRecentlyViewedItem(Item item) {
        if(this.map.containsKey((item.getId()))) {
            this.map.remove(item.getId());
        }

        if(this.map.size() > maxSize) {
            this.map.remove(map.keySet().iterator().next());
        }
        this.map.put(item.getId(), item);
    }

    public LinkedHashMap<String, Item> getMap() {
        return map;
    }
}
