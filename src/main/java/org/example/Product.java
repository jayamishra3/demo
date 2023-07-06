package org.example;

public class Product {
    private int id;
    private String name;
    private double price;

    private Category category;
    public enum Category {
        FOOD,
        ELECTRONICS,
        CLOTHES,
        OTHER
    }

    public Product(int id, String name, double price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public Category getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }


}
