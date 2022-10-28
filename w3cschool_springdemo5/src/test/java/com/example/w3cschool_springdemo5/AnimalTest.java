package com.example.w3cschool_springdemo5;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {
    @Test
    public void beanDefine() {
        //创建spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean对象并使用
        Car car = context.getBean(Car.class);
        car.printBeanName();
    }
}
