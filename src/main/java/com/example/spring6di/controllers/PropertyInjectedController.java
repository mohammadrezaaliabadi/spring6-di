package com.example.spring6di.controllers;

import com.example.spring6di.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
