package com.scaler.lab.Entity.items;

import java.util.HashSet;
import java.util.Set;

public class WishList{
    private Set<Item> wishListItems;

    public WishList() {
        this.wishListItems = new HashSet<Item>();
    }

    public Set<Item> getWishListItems() {
        return wishListItems;
    }

    public void addToWishlist(Item item) {
        this.wishListItems.add(item);
    }

    public void removeFromWishlist(Item item) {
        this.wishListItems.remove(item);
    }
}
