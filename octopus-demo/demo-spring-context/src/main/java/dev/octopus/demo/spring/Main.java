package dev.octopus.demo.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(AppConfig.class );
        ctx.refresh();

        HelloWorld myService = ctx.getBean(HelloWorld.class);
        myService.hi();

        Consumer consumer = ctx.getBean(Consumer.class);
        consumer.hi();

        ctx.registerShutdownHook();

    }
}
