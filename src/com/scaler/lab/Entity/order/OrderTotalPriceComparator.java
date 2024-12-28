package com.scaler.lab.Entity.order;

import java.util.Comparator;

public class OrderTotalPriceComparator implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
         if(o1.getTotalAmount() > o2.getTotalAmount()) {
             return -1;
         }
         return 1;
    }

}
