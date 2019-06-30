package edu.dcccd.lesson10.entities;


import lombok.Data;

@Data
public class Greeting {

    private String greeting;

    public Greeting(String greeting) {
        this.greeting = greeting;
    }
}
