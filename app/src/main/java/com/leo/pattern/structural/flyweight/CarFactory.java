package com.leo.pattern.structural.flyweight;

import com.leo.pattern.creational.factory.Circle;
import com.leo.pattern.creational.factory.Square;

/**
 * @author leo, ZhangWei
 * @date 2018/6/26
 */
public class CarFactory {

    public static final String AUDI = "Circle";
    public static final String BMW = "Square";

    public Car getCar(String type) {
        Car car = null;
        switch (type) {
            case AUDI:
                car = new Audi();
                break;
            case BMW:
                car = new BMW();
                break;
            default:
        }

        return car;
    }

}
