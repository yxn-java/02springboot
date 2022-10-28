package com.example.w3cschool_springdemo6;

import org.springframework.context.ApplicationEvent;

public class UserEvent extends ApplicationEvent {


    private User user;


    public UserEvent(Object source) {
        super(source);
    }


    public UserEvent(Object source, User user) {
        super(source);
        this.user = user;
    }


    public User getUser() {
        return user;
    }
}
