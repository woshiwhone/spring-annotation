package com.sse.annotation;

import com.sse.annotation.bean.Person;
import com.sse.annotation.config.MainConfigOfLifeCycleUseCar;
import com.sse.annotation.config.MainConfigOfProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ComponentScan("com.sse.annotation.bean")
public class IocTest_LifeCycle {


    @Test
    public void test01() {
        //1.创建ioc容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLifeCycleUseCar.class);
        System.out.println("容器创建完成...");
//        String[] names = context.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
        //关闭容器时调用自定义的销毁方法
        Object car01 = context.getBean("car01");
        System.out.println("拿到car01了吗？-》" + car01);
        printBeans(context);
        context.close();
    }


    /**
     * 测试@Value注解,@PropertySource注解
     */
    @Test
    public void test02() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfProperty.class);

        printBeans(context);
        Person person = (Person) context.getBean("person");
        System.out.println(person);

    }

    private void printBeans(AnnotationConfigApplicationContext context) {
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
