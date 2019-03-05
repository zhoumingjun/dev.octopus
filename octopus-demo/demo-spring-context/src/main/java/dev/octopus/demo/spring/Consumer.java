package dev.octopus.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Consumer {
    @Autowired
    HelloWorld helloworld;

    public void hi(){
        helloworld.hi();
    }
}
