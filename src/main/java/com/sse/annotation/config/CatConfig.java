package com.sse.annotation.config;

import com.sse.annotation.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @name: CatConfig
 * @author: xiangyf
 * @create: 2019-11-16 13:56
 * @description:
 * 基于注解@ComponentScan的方式来扫描组件，在里面还可以指定禁用哪些filter，或者包含哪些
 * @ComponentScan(value = "com.sse.annotation",includeFilters =
 * {@ComponentScan.Filter(type = FilterType.ANNOTATION,
 *  classes = {Controller.class, Configuration.class})}
 *         , useDefaultFilters = false)
 */
@Configuration
public class CatConfig {

    @Bean(name = "mycat")
    public Cat getCat(){
        return new Cat();
    }
}
