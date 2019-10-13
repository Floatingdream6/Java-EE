package com.zut.Util;

import org.springframework.stereotype.Component;

/**
 * Created by 韩俊哲
 * on 2019/10/12
 */

@Component
public class Car {
    private String brand;
    private String color;
    private float displacement;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", displacement=" + displacement +
                '}';
    }
}
