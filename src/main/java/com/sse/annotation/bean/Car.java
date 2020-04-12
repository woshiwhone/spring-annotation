package com.sse.annotation.bean;

public class Car {
    private String name;

    public Car() {
        System.out.println("car construct....");
    }

    public Car(String name){
        this.name = name;
    }

    public void init() {
        System.out.println(" car init......");
    }

    public void destroy() {
        System.out.println("car destroy.....");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
