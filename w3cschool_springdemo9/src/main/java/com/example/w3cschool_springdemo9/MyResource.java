package com.example.w3cschool_springdemo9;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

public class MyResource implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;


    public void resourceInfo(String location) throws IOException {
        Resource resource = this.resourceLoader.getResource(location);
        System.out.println("文件名：" + resource.getFilename());
        System.out.println("文件名长度：" + resource.contentLength());


    }


    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
