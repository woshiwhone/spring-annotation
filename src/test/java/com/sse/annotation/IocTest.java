package com.sse.annotation;

import com.sse.annotation.bean.Cat;
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

        Cat cat1 = (Cat)context.getBean("mycat");
        System.out.println(cat1);

        for (String clazz: context.getBeanDefinitionNames()){
            System.out.println(clazz
        }
    }

    private ApplicationContext getContext(Class clazz){
        return new AnnotationConfigApplicationContext(clazz);
    }
}
