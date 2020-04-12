package com.sse.annotation.bean;

/**
 * @author yf.xiang
 * @date 2020-04-12 15:47
 */
public class Color {
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
