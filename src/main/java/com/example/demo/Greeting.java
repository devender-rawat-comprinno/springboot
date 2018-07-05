package com.example.demo;

import java.io.Serializable;

public class Greeting implements Serializable {

    private String name;
    private String greet;

    public Greeting(String greet,String name) {
    this.greet=greet;
    this.name=name;
    }

    public Greeting(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }

    public Greeting(long l, String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "greet='" + greet + '\'' +
                '}';
    }
}
