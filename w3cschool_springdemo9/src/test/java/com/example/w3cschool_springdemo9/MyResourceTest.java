package com.example.w3cschool_springdemo9;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class MyResourceTest {
    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        MyResource myResource = context.getBean(MyResource.class);
        myResource.resourceInfo("classpath:config.txt");
    }
}

