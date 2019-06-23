package com.sse.annotation.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {
    public Dog() {
        System.out.println("dog constructor...");
    }

    @PostConstruct//对象创建并赋值之后调用
    public void init() {
        System.out.println("dog init....@PostConstruct....");
    }

    @PreDestroy//容器移除对象之前
    public void destroy() {
        System.out.println("dog destroy....@PreDestroy....");
    }
}
