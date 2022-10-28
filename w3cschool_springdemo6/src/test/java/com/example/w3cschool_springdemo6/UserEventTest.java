package com.example.w3cschool_springdemo6;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserEventTest {
    @Test
    public void testEvent() {
        //创建spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean对象并使用
        RegisterService registerService = context.getBean(RegisterService.class);
        System.out.println("开始注册用户");
        User u = new User();
        u.setId(1);
        u.setName("jason");
        u.setMobile("12345678909");
        u.setEmail("jason@qq.com");
        registerService.register(u);
    }
}
