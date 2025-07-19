package com.example.constructordi;

import org.springframework.stereotype.Component;

@Component
public class College {

    private Principal principal;
    private Teacher teacher;

    // 🔴 Constructor Injection here
    public College(Principal principal, Teacher teacher) {
        this.principal = principal;
        this.teacher = teacher;
    }

    public void collegeInfo() {
        principal.info();
        teacher.teach();
        System.out.println("Welcome to the College!");
    }
}
