package com.revature.model;

public class Product {
    public String name;
    public String description;
    public double cost; // has a decimal

    // this is a constructor
    public Product(String name, String description, double cost){
        this.name = name; // this instances version = what's being passed in
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}
