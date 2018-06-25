package com.leo.pattern.structural.decorator;

/**
 * @author leo, ZhangWei
 * @date 2018/6/25
 */
public abstract class WindowDecorator implements Window {

    protected Window decoratedWindow;

    public WindowDecorator(Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    @Override
    public void draw() {
        decoratedWindow.draw();
    }
}
