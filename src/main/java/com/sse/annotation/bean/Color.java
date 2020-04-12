package com.sse.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author yf.xiang
 * @date 2020-04-12 15:47
 */
//@ComponentScan(basePackages = "com.sse.annotation.config.MainConfigOfLifeCycleUseCar")
@Component
public class Color {

    @Autowired
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color [car=" + car + "]";
    }
}
