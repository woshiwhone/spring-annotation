package com.sse.annotation.config;

import com.sse.annotation.bean.Cat;
import com.sse.annotation.bean.Dog;
import com.sse.annotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import java.lang.annotation.Annotation;

//基于注解@ComponentScan的方式来扫描组件，在里面还可以指定禁用哪些filter，或者包含哪些
//@ComponentScan(value = "com.sse.annotation",
// includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
// classes = {Controller.class, Configuration.class})}
//        , useDefaultFilters = false)
@Configuration
public class AnnoConfig {

    @Bean(name = "mycat")
    public Cat getCat(){
        return new Cat();
    }

    @Bean("person02")
    public Person person02() {
        return new Person(35, "陈家洛", "天地会总舵主");
    }
}
