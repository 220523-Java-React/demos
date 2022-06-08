package com.revature.controller;

import com.revature.model.Product;
import com.revature.service.ProductService;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import org.jetbrains.annotations.NotNull;

/**
 * The ProductController is designed to handle web requests for the Product resource
 * The goal of a controller is to be able to invoke the CRUD operations that exist within the
 * service layer
 **/
public class ProductController {
    ProductService productService = new ProductService();

    // READ
    public Handler getAllProducts = ctx -> {
        ctx.result(productService.getAllProducts().toString());
    };

    // CREATE
    public Handler createNewProduct = ctx -> {
        productService.createNewProduct(new Product(
                "Milk",
                "1 Gallon",
                3.49
        ));

        ctx.status(201); // send back 201 created to suggest a resource was created
    };
}
