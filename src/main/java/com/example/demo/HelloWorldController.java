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



    @RequestMapping (value = "/op", method = RequestMethod.POST )
    public @ResponseBody Greeting acceptRequest(@RequestBody Greeting gre) throws Exception{
             Greeting g=new Greeting();
             g.setName(gre.getName());

             return g;

    }

}
