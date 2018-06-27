package com.leo.pattern.behavioral.command;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public class FlipUpCommand extends AbstractCommand {

    public FlipUpCommand(Light theLight) {
        super(theLight);
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}
