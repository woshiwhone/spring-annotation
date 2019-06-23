package com.sse.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;


//使用@PropertySource读取外部配置文件中的k/v保存到运行环境中，然后通过${}来访问
@PropertySource(value = {"classpath:/application.yml"})
public class Person {
    /**
     * 通过@Value()进行赋值
     * 1.基本数值
     * 2.可以写SpEL表达式，#{}
     * 3.可以配置文件当中读取，${},使用@PropertySource加载外部配置文件，然后@Value注解才能找到哦啊
     */
//    @Value("${person.age}")
    private Integer age;

//    @Value("${person.name}")
    private String name;

//    @Value("${person.nickname}")
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Person() {
    }

    public Person(Integer age, String name, String nickname) {
        this.age = age;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
