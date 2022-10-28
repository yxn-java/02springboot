package com.example.w3cschool_springdemo10;

import org.springframework.core.io.Resource;

import java.io.IOException;

public class MyResource{
    //在spring.xml中配置location,注入resource对象到该属性
    private Resource resource;


    public void setResource(Resource resource) {
        this.resource = resource;
    }


    public void resourceInfo() throws IOException {
        System.out.println("文件名：" + resource.getFilename());
        System.out.println("文件名长度：" + resource.contentLength());


    }
}
