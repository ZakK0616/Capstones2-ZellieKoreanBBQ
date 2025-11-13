package com.pluralsight.models;

public class Items {
    private String name;
    private String category;
    private double price;
    private String size;
    private String special;

    public Items(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.size = "";
        this.special = "";
    }

    public Items(String name, String category, double price, String size, String special) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.size = size;
        this.special = special;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
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
    public String toString() {
        String result = name;
        if (!size.isEmpty()) result += " (" + size + ")";
        if (!special.isEmpty()) result += " [" + special + "]";
        result += " - $" + String.format("%.2f", price);
        return result;
    }

    }

