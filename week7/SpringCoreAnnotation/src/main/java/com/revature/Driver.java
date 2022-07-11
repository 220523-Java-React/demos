package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Component
public class Driver {

    private MOTDService motdService;

    // Constructor Injection
    // Ask the IoC to Automatically Wire up a bean that matches this dependency
    @Autowired
    public Driver(MOTDService motdService){
        this.motdService = motdService;
    }

    public static void main(String[] args) {
        /**
         *      In Spring there is a concept called Component Scanning
         *
         *      This allows spring to automatically scan your packages for any classes / interfaces marked with
         *      the @Component -> this tells spring that it should wired up in the IoC container.
         *      .@Component is called a stereotype
         *
         *          Stereotypes
         *              Component                   - basic, general use stereotype annotation
         *              Controller / RestController - special type of component for handling HTTP requests
         *              Service                     - special type of component for handling business logic
         *              Repository                  - special type of component for handling database logic
         *
         *     Component Scanning is disabled by default
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // enable component scanning
        context.scan("com.revature");
        context.refresh(); // we need to refresh the context before it can be referenced

        Driver driver = context.getBean(Driver.class);

        // valid index
        System.out.println(driver.motdService.getMessage(2));
        // invalid index
        System.out.println(driver.motdService.getMessage(7));

        System.out.println(driver.motdService.hashCode());
        System.out.println(context.getBean(MOTDService.class).hashCode());
    }
}
