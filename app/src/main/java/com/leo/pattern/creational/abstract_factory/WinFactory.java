package com.leo.pattern.creational.abstract_factory;

/**
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public class WinFactory extends AbstractFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Border createBorder() {
        return new WinBorder();
    }
}
