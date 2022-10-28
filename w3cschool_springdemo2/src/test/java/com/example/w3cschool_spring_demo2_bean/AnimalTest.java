package com.example.w3cschool_spring_demo2_bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {

    @Test
    public void eat() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //animal对应的是Bean配置的id值，因此可以通过id获取spring对象
        Animal animal = (Animal) context.getBean("animal");
        animal.eat();
        //spring容器也可以通过class获取到对象
        Animal animal2 = (Animal) context.getBean("animal");
        animal2.eat();
    }
}
