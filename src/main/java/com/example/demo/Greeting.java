package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

public class Greeting implements Serializable {

    private String name;

    public Greeting() {
    }

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Greeting(long l, String name) {

        this.name = name;
    }
}
