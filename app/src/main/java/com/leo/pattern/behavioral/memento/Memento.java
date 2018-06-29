package com.leo.pattern.behavioral.memento;

/**
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象
 *
 * @author leo, ZhangWei
 * @date 2018/6/28
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
