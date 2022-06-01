package com.revature;

import com.revature.controller.ProductController;
import com.revature.model.Product;
import com.revature.service.ProductService;
import io.javalin.Javalin;

import java.util.ArrayList;
import java.util.logging.Handler;

public class Driver {
    public static void main(String[] args) {
        ProductController productController = new ProductController();

        // the Javalin object acts as our web server
        // the Javalin constructor has protected access so we can't call it directly.
        Javalin app = Javalin.create();
        // now that app object is created, we need to start it.
        app.start(8080); // 8080 is a port // this application is running and listening on localhost:8080
        // app.get is creating handler on a specific path
        // it takes 2 arguments
        //          first: what path are listening on
        //          second: wheat do you want to do in response??
        app.get("/", ctx -> ctx.result("Hello world from Javalin"));
        app.get("/products", productController.getAllProducts);
        app.post("/products", productController.createNewProduct);
    }
}
