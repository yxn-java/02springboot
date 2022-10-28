package com.example.w3cschool_spring_demo2_bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Animal {
    private BlackCat cat;

    public void setCat(BlackCat cat) {
        this.cat = cat;
    }

    public void initAnimal() {
        System.out.println("animal init");
    }

    public void eat() {
        cat.eat();
    }
}
