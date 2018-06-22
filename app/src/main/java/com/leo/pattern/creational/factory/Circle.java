package com.leo.pattern.creational.factory;

/**
 * 实例对象
 *
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is a circle");
    }
}
