package com.leo.pattern.creational.abstract_factory;

/**
 * 抽象工厂规范了产品族
 * 实例工厂根据规范的不同细节各自实现
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public abstract class AbstractFactory {

    public abstract Button createButton();

    public abstract Border createBorder();
}
