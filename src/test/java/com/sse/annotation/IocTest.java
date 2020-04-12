package com.sse.annotation;

import com.sse.annotation.bean.Cat;
import com.sse.annotation.bean.Color;
import com.sse.annotation.config.AnnoConfig;
import com.sse.annotation.config.CatConfig;
import com.sse.annotation.config.MainConfig2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @name: IocTest
 * @author: xiangyf
 * @create: 2019-11-16 13:58
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class IocTest {

    @Test
    public void test05(){

        ApplicationContext context = getContext(MainConfig2.class);
        System.out.println("容器创建完成...");

//        Cat cat1 = (Cat)context.getBean("mycat");
//        System.out.println(cat1);

        for (String clazz: context.getBeanDefinitionNames()){
            System.out.println(clazz);
        }

        System.out.println("*********");

        Color color1 = (Color) context.getBean("colorFactoryBean");
        Color color2 = (Color) context.getBean("colorFactoryBean");
        System.out.println("colorFactoryBean => color1:" + color1);
        System.out.println("color1 == color2 :" + (color1 == color2));
        System.out.println("colorFactoryBean => color1 => getCar:" + color1.getCar());
        System.out.println("myCar:" + context.getBean("myCar"));


        System.out.println("com.sse.annotation.bean.Color => color对象:" + context.getBean("com.sse.annotation.bean.Color"));
        System.out.println("colorFactoryBean本身:" + context.getBean("&colorFactoryBean"));

        System.out.println("*********");



//        System.out.println("ApplicationContext相关...");
//        System.out.println(context.getId());
//        System.out.println(context.getApplicationName());
//        System.out.println(context.getDisplayName());
//        System.out.println(context.getParent());

        System.out.println("*********");
    }

    private ApplicationContext getContext(Class clazz){
        return new AnnotationConfigApplicationContext(clazz);
    }
}
