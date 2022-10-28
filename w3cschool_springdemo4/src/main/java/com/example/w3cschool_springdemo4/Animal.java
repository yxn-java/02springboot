package com.example.w3cschool_springdemo4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Animal implements InitializingBean, DisposableBean {


    public void destroy() throws Exception {
        System.out.println("animal destory by DisposableBean");
    }


    public void afterPropertiesSet() throws Exception {
        System.out.println("animal init by InitializingBean");
    }
    //xml配置初始化方法
    public void initByXml() {
        System.out.println("animal init by xml");
    }
    //xml配置的销毁方法
    public void destoryByXml() {
        System.out.println("animal destory by xml");
    }
}
