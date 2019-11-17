package com.sse.annotation;

import com.sse.annotation.bean.Cat;
import com.sse.annotation.config.AnnoConfig;
import com.sse.annotation.config.CatConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CatConfig.class);
        System.out.println("容器创建完成...");

        Cat cat1 = (Cat)context.getBean("mycat");
        System.out.println(cat1);
    }
}
