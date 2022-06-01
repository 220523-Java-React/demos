package com.revature.service;

import com.revature.model.Product;

import java.util.ArrayList;

/**
 * The ProductService is designed to handle the business logic of the application
 * A service should be completely decoupled from web functionality
 *
 * Provide code to support CRUD operations on behalf of the Product resource
 */
public class ProductService {
    private ArrayList<Product> products = new ArrayList<>(); // private means that I need to be in this class to access

    // CREATE
    // Adds a new product to the list
    public void createNewProduct(Product product){
        products.add(product);
    }

    // READ crud operation
    // returns the list
    public ArrayList<Product> getAllProducts(){
        return products;
    }

    // UPDATE
    // DELETE
}
