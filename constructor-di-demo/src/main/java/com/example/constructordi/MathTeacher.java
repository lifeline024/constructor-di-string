package com.example.constructordi;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("MathTeacher is teaching mathematics...");
    }
}
