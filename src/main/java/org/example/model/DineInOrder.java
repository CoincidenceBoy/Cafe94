package org.example.model;

// DineInOrder 子类
public class DineInOrder extends Order {
    @Override
    public void showOrderDetails() {
        System.out.println("DineIn Order ID: " + orderId + " for table number " + tableNumber);
    }
}