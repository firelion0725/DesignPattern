package com.leo.pattern.structural.flyweight;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author leo, ZhangWei
 * @date 2018/6/26
 */
public class CarFlyWeightFactory {

    private static final Map<String, Car> FLY_WEIGHT_MAP = new Hashtable<>();
    private static CarFactory factory = new CarFactory();

    public static Car getCar(String key) {
        Car car = FLY_WEIGHT_MAP.get(key);
        if (car == null) {
            car = factory.getCar(key);
            FLY_WEIGHT_MAP.put(key, car);
        }
        return car;
    }

}
