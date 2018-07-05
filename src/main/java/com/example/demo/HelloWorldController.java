package com.example.demo;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


//HelloWorldController class will publish all web service end points
// Handles requests for the Greeting

@Controller
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/hello-world", method = RequestMethod.POST)
    
    public @ResponseBody Greeting sayHello(@RequestBody Greeting gre) {

     
        return new Greeting(String.format(template, gre.getName()),gre.getName());
    }


  

}
