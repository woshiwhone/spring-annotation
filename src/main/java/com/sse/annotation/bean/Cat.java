package com.sse.annotation.bean;

/**
 * @name: Cat
 * @author: xiangyf
 * @create: 2019-11-15 19:05
 * @description:
 */
public class Cat {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
