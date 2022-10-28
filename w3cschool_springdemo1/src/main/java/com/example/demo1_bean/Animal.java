package com.example.demo1_bean;

import org.springframework.beans.factory.annotation.Autowired;
public class Animal {
    @Autowired
    private BlackCat cat;

    public void eat() {
        cat.eat();
    }
}
