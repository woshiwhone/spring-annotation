package com.sse.annotation.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog {

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

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
