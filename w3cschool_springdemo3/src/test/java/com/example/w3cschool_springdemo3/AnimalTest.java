package com.example.w3cschool_springdemo3;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalTest {


    @Test
    public void beanDefine() {
        //创建spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        //获取bean对象并使用
        context.getBean("animal");
        System.out.println("spring container close");
        //spring容器关闭，销毁bean
        context.close();
    }


}

