package com.sse.annotation;

import com.sse.annotation.bean.Person;
import com.sse.annotation.config.AnnoConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ContextOfXmlAndAnnotation {
    public static void main(String[] args) {
       // 以前的方法，从类路径下加载beans.xml文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("static/beans.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        //使用spring基于注解的方法
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AnnoConfig.class);
        Object person02 = context2.getBean("person02");
        System.out.println(person02);

//        Person person03 = (Person)context2.getBean("person03");
//        System.out.println(person03);

        String[] names = context2.getBeanDefinitionNames(); //取出容器中所有定义了的bean
        for (String name : names) {
            System.out.println(name);
        }
    }

}
