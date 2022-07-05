package com.revature;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// The Configuration annotation tells spring that this class should be used to instruct what objects are wired as beans
@Configuration
public class AppConfig {
    @Bean
    public MOTDService getMotdService(){
        return new MOTDService();
    }

    @Bean
    public Driver getDriver(){
        return new Driver(getMotdService());
    }
}
