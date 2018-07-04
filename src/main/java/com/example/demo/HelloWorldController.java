package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sun.glass.ui.SystemClipboard;
import jdk.nashorn.internal.ir.annotations.Reference;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Past;


@Controller
public class HelloWorldController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/hello-world", method = RequestMethod.POST, produces = { "application/json","application/xml"})
    @ResponseBody
    public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
        Greeting s=new Greeting(counter.incrementAndGet(), String.format(template, name));
        System.out.println(s.getName());
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping (value = "/op", method = RequestMethod.POST )
    public @ResponseBody Greeting acceptRequest(@RequestBody Greeting gre) throws Exception{
             Greeting g=new Greeting();
             g.setName(gre.getName());

             return g;

    }

}
