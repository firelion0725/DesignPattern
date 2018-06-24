package com.leo.pattern.creational.abstract_factory;

/**
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public class MacFactory extends AbstractFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Border createBorder() {
        return new MacBorder();
    }
}
