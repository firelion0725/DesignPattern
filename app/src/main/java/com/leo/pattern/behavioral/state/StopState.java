package com.leo.pattern.behavioral.state;

/**
 * @author leo, ZhangWei
 * @date 2018/6/29
 */
public class StopState implements State {
    @Override
    public void doAction() {
        System.out.println("Player is in stop state");
    }
}
