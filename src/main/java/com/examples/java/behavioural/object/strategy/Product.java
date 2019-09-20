package com.examples.java.behavioural.object.strategy;

public class Product {

    private long id;

    private String name;

    private double price;

    private double tax;

    private double total;

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.total = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
