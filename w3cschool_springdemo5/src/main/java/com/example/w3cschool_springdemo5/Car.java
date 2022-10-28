package com.example.w3cschool_springdemo5;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

//注解@Component value可以表示bean name
@Component("smartCar")
public class Car implements BeanNameAware {
    private String beanName;
    public void setBeanName(String name) {
        this.beanName = name;
    }


    public void printBeanName() {
        System.out.println("beanName=" + this.beanName);
    }
}
