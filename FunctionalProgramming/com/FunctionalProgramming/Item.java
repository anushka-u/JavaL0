package com.FunctionalProgramming;

public class Item {
    String itemName;
    double price;

    public Item(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }

    public String setItemName(String itemName) {
        return this.itemName = itemName;
    }

    public double setPrice(double price) {
        return this.price = price;
    }
}

