package com.leo.pattern.behavioral.interpreter;

/**
 * @author leo, ZhangWei
 * @date 2018/7/3
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
