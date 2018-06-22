package com.leo.pattern.creational.abstract_factory;

/**
 * 每一个模式都是针对一定问题的解决方案，工厂方法模式针对的是一个产品等级结构；而抽象工厂模式针对的是多个产品等级结构。
 *
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public abstract class AbstractShapeFactory {

    abstract Shape getShape(String type);

    abstract Color getColor(String color);
}
