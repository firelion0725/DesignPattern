package com.leo.pattern.structural.bridge;

/**
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public class Bird implements Animal {

    private Action action;

    public Bird(Action action) {
        this.action = action;
    }

    @Override
    public void todo() {
        action.act();
    }
}
