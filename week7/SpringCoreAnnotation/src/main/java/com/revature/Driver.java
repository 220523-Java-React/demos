package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

    private MOTDService motdService;

    // Constructor Injection
    // Ask the IoC to Automatically Wire up a bean that matches this dependency
    @Autowired
    public Driver(MOTDService motdService){
        this.motdService = motdService;
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver = context.getBean(Driver.class);

        // valid index
        System.out.println(driver.motdService.getMessage(2));
        // invalid index
        System.out.println(driver.motdService.getMessage(7));

        System.out.println(driver.motdService.hashCode());
        System.out.println(context.getBean(MOTDService.class).hashCode());
    }
}
