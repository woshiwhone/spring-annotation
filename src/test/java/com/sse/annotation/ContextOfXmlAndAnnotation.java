package com.sse.annotation;

import com.sse.annotation.bean.Person;
import com.sse.annotation.config.AnnoConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @name: ContextOfXmlAndAnnotation
 * @author: yf.xiang
 * @create: 2019-11-21 16:27
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ContextOfXmlAndAnnotation {

    @Test
    public void test1(){
        // 以前的方法，从类路径下加载beans.xml文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("static/beans.xml");
        Person person = (Person) context.getBean("person01");
        System.out.println(person);
        String[] beanArr1 = context.getBeanDefinitionNames();
        for (String bean: beanArr1){
            System.out.println(bean);
        }

        System.out.println("=================");
        //使用spring基于注解的方法
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(AnnoConfig.class);
        Object person02 = context2.getBean("person02");
        System.out.println(person02);

        String[] names = context2.getBeanDefinitionNames(); //取出容器中所有定义了的bean
        for (String name : names) {
            System.out.println(name);
        }

    }

}
