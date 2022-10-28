package com.example.w3cschool_springdemo7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
        Student student = context.getBean(Student.class);
        student.printClassRoomName();
    }
}
