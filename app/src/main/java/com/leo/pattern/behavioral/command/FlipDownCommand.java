package com.leo.pattern.behavioral.command;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public class FlipDownCommand extends AbstractCommand {
    public FlipDownCommand(Light theLight) {
        super(theLight);
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}
