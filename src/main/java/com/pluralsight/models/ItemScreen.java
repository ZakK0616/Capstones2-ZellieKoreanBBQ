package com.pluralsight.models;

public class ItemScreen {
    private String name;
    private String category;
    private double price;

    public ItemScreen(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return name + " (" + category + ") - $" + String.format("%.2f", price);
    }
}
