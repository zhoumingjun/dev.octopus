package dev.octopus.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    @Bean
    public Consumer consumer(){
        return new Consumer();
    }
}
