package com.scaler.lab.Entity.order;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
    private PriorityQueue<Order> orderQueue;
    public OrderProcessor(){
            this.orderQueue = new PriorityQueue<>();
    }

    public void addOrder(Order order){
        this.orderQueue.add(order);
    }

    public Order processOrder() {
        return this.orderQueue.poll();
    }

    public void setComparator(OrderTotalPriceComparator comparator) {
        this.orderQueue = new PriorityQueue<>(comparator);
    }

    public int getOrderCount() {
        return this.orderQueue.size();
    }

}
