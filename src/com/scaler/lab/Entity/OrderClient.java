package com.scaler.lab.Entity;

import com.scaler.lab.Entity.items.Book;
import com.scaler.lab.Entity.items.WishList;
import com.scaler.lab.Entity.order.Order;
import com.scaler.lab.Entity.order.OrderProcessor;
import com.scaler.lab.Entity.order.OrderTotalPriceComparator;

public class OrderClient {
    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addOrder(new Order(true,"1",200 ));
        orderProcessor.addOrder(new Order(false,"2",300 ));
        orderProcessor.addOrder(new Order(true,"3",400 ));

/*
        while(orderProcessor.getOrderCount()>0){
           Order order = orderProcessor.processOrder();
           System.out.println(order.getOrderId());
        }
*/


        OrderProcessor orderProcessor2 = new OrderProcessor();
        orderProcessor2.setComparator(new OrderTotalPriceComparator());

        orderProcessor2.addOrder(new Order(true,"1",100 ));
        orderProcessor2.addOrder(new Order(false,"2",500 ));
        orderProcessor2.addOrder(new Order(true,"3",400 ));

       // orderProcessor2.setComparator(new OrderTotalPriceComparator());
        while(orderProcessor2.getOrderCount()>0){
            Order order = orderProcessor2.processOrder();
            System.out.println(order.getOrderId());
        }


    }
}
