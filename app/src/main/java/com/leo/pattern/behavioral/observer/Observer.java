package com.leo.pattern.behavioral.observer;

/**
 * @author leo, ZhangWei
 * @date 2018/6/29
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();

}
