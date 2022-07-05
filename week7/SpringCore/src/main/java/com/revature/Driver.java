package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *          This demo will leverage XML Based Bean Wiring
 *          All of our configuration will be in an application-context.xml
 *          XML -> Similar to HTML in that both are Markup Languages -> meaning it also follows a tag structure
 *
 *
 *          The alternative in another demo will be Programmatic/Annotation based wiring
 */


public class Driver {

    private MOTDService service;

    // Constructor Injection
    public Driver(MOTDService motdService){
        this.service = motdService;
    }

    public static void main(String[] args) {
        // Here is where we will create the Application Context -> this is the IoC -> single source of all of our components/beans
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        // get a bean by name/class
        Driver driver = context.getBean("DriverBean", Driver.class);
        // get a message of the day with a valid index
        System.out.println(driver.service.getMessage(1));
        // get a message of the day with an invalid index
        System.out.println(driver.service.getMessage(34));
        // get one of the objects a second time, and confirm that the hashcode is the same -> means it's the same object

        // get a bean by class if its the only one with that class
        MOTDService service = context.getBean(MOTDService.class);

        System.out.println("Service Standalone: " + service.hashCode());
        System.out.println("Driver Service    : " + driver.service.hashCode());

    }
}
