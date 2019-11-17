package com.sse.annotation;

import com.sse.annotation.bean.Cat;
import com.sse.annotation.bean.Person;
import com.sse.annotation.config.AnnoConfig;
import com.sse.annotation.config.MainConfigOfLifeCycleUseCar;
import com.sse.annotation.config.MainConfigOfProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ComponentScan("com.sse.annotation.bean")
public class IocTest_LifeCycle extends Object {

    @Test
    public void test05(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnoConfig.class);
        System.out.println("容器创建完成...");

        Cat cat1 = (Cat)context.getBean("mycat");
        System.out.println(cat1);
    }

    @Test
    public void test06(){
        // 以前的方法，从类路径下加载beans.xml文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("static/Cat.xml");
        Cat cat2 = (Cat) context.getBean("cat2");
        System.out.println(cat2);
    }


    @Test
    public void test04() {
        Date timestamp = new Date();
        System.out.println(timestamp);
        System.out.println(timestamp.getTime());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(timestamp.getTime()));

        System.out.println("----------------");

        System.out.println(System.currentTimeMillis());
        System.out.println(new Date().getTime());
    }

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
        Person person = (Person) context.getBean("person03");
        System.out.println(person);

    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnoConfig.class);

        printBeans(context);
        Person person = (Person) context.getBean("person02");
        System.out.println(person);

    }

    private void printBeans(AnnotationConfigApplicationContext context) {
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
