package com.leo.pattern.behavioral.state;

/**
 * @author leo, ZhangWei
 * @date 2018/6/29
 */
public class StartState implements State {
    @Override
    public void doAction() {
        System.out.println("Player is in start state");
    }
}
