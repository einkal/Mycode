package com.scaler.lab.Entity.order;

import java.util.Comparator;

public class OrderQuantityComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if(o1.getQuantity() > o2.getQuantity()) {
            return -1;
        }
        return 1;
    }
}
