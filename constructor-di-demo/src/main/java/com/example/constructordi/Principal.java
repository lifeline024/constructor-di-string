package com.example.constructordi;

import org.springframework.stereotype.Component;

@Component
public class Principal {
    public void info() {
        System.out.println("I am your Principal.");
    }
}
