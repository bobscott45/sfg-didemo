package dev.bobscott.didemo.controllers;

import dev.bobscott.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;


    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello from Spring Boot!");
        System.out.println(greetingService.sayGreeting());
        return "foo";
    }
}
