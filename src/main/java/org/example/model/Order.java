package org.example.model;

public abstract class Order {
    protected int orderId;
    protected String orderType;
    protected String[] orderedItems;
    protected String orderStatus;
    protected int tableNumber; // 如果是堂食，使用此字段
    protected String deliveryAddress; // 如果是外卖，使用此字段

    public abstract void showOrderDetails();

    // Getter 和 Setter
    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public String getOrderType() { return orderType; }
    public void setOrderType(String orderType) { this.orderType = orderType; }

    public String[] getOrderedItems() { return orderedItems; }
    public void setOrderedItems(String[] orderedItems) { this.orderedItems = orderedItems; }

    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

    public int getTableNumber() { return tableNumber; }
    public void setTableNumber(int tableNumber) { this.tableNumber = tableNumber; }

    public String getDeliveryAddress() { return deliveryAddress; }
    public void setDeliveryAddress(String deliveryAddress) { this.deliveryAddress = deliveryAddress; }
}



