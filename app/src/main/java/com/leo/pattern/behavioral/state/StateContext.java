package com.leo.pattern.behavioral.state;

/**
 * @author leo, ZhangWei
 * @date 2018/7/2
 */
public class StateContext {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle() {
        state.doAction();
    }
}
