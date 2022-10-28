package com.example.w3cschool_springdemo6;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;




    public void register(User user) {
        applicationEventPublisher.publishEvent(new UserEvent(this, user));
    }


    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
