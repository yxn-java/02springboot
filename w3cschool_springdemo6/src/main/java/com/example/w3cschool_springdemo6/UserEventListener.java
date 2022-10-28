package com.example.w3cschool_springdemo6;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener implements ApplicationListener<UserEvent> {
    public void onApplicationEvent(UserEvent userEvent) {
        System.out.println("注册的用户邮箱：" + userEvent.getUser().getEmail());
        System.out.println("注册的用户手机号：" + userEvent.getUser().getMobile());
    }
}
