package com.leo.pattern.behavioral.command;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public class Switch {
    public void storeAndExecute(Command cmd) {
        cmd.execute();
    }
}
