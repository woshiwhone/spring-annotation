package com.sse.annotation.config;


import com.sse.annotation.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @name: MainConfigOfLifeCycleUseCar
 * @author: xiangyf
 * @create: 2019-04-16 13:58
 * bean的生命周期：
 * bean创建----初始化-----销毁的过程
 * 容器可以自动管理bean的生命周期；
 * 但是我们也可以自定义初始化和销毁方法，容器在bean进行到当前生命周期的时候来调用我们自定义的初始化和销毁方法
 * <p>
 * 构造（创建对象）：
 * 单实例，在容器启动的时候创建对象
 * 多实例，在每次获取的时候创建对象
 * 初始化：
 * 对象创建完成，并赋值好，调用初始化方法
 * 销毁：
 * 容器关闭的时候
 * 以上都是单实例情况，多实例不同！
 * <p>
 * 1）、指定初始化和销毁方法
 * 在@Bean注解里面指定init-method和destroy-method方法
 * 2)、 让bean实现InitializingBean接口（定义初始化逻辑）
 */
@Configuration
public class MainConfigOfLifeCycleUseCar {

    //    @Scope("prototype")//多实例的时候不会自动调用初始化方法，需要在你获取的时候才会调用
//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public Car myCar() {
//        return new Car("劳斯莱斯");
//    }
}
