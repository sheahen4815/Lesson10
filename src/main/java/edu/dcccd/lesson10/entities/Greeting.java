package edu.dcccd.lesson10.entities;


import lombok.*;

@Data
public class Greeting {

    private String greeting;

    public Greeting() {
    }

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }
}
