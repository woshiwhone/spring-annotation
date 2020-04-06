package com.sse.annotation.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @name: MyWebMvcConfig
 * @author: xiangyf
 * @create: 2019-11-19 20:01
 * @description:
 */
public class MyWebMvcConfig  extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        super.addInterceptors(registry);
//        registry.addInterceptor()

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        registry.addViewController("/hello").setViewName("/");
    }
}
