package com.sse.annotation.config;

import com.sse.annotation.Servlet.MyServlet;
import com.sse.annotation.filter.MyFilter;
import com.sse.annotation.listener.MyListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;
import java.util.Arrays;

/**
 * @name: MyServletConfig
 * @author: xiangyf
 * @create: 2019-11-17 17:20
 * @description:
 */
@Configuration
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean myServlet = new ServletRegistrationBean();
        myServlet.addUrlMappings("/myservlet");
        myServlet.setServlet(new MyServlet());
        return myServlet;
    }

    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean myFilter = new FilterRegistrationBean();
        myFilter.setFilter(new MyFilter());
        myFilter.setUrlPatterns(Arrays.asList("/hello", "/aaa"));
        return myFilter;
    }

    @Bean
    public ServletListenerRegistrationBean myLister(){
        ServletListenerRegistrationBean<MyListener> myLister = new ServletListenerRegistrationBean<>(new MyListener());
        return myLister;
    }


}
