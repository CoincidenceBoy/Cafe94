package org.example.model;

public class MenuItem {
    private int itemId;
    private String itemName;
    private double price;
    private String description;

    public MenuItem(int itemId, String itemName, double price, String description) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.description = description;
    }

    // Getter 和 Setter
    public int getItemId() { return itemId; }
    public void setItemId(int itemId) { this.itemId = itemId; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}

