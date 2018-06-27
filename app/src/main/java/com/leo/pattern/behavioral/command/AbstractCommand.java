package com.leo.pattern.behavioral.command;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public abstract class AbstractCommand implements Command {

    protected Light theLight;

    public AbstractCommand(Light theLight) {
        this.theLight = theLight;
    }
}
