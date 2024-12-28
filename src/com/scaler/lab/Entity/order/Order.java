package com.scaler.lab.Entity.order;

public class Order implements Comparable<Order>{
    private String orderId;
    boolean isExpress;
    int totalAmount;
    int quantity;


    public Order(boolean isExpress, String orderId, int totalAmount) {
        this.isExpress = isExpress;
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public int compareTo(Order o) {
        if(this.isExpress == o.isExpress){
            return this.orderId.compareTo(o.orderId);
        } else if (this.isExpress){
            return -1;
        } else {
            return 1;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
