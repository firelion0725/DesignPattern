package com.leo.pattern.behavioral.interpreter;

/**
 * 解释器模式提供了评估语言的语法或表达式的方式
 * @author leo, ZhangWei
 * @date 2018/7/3
 */
public interface Expression {
    public boolean interpret(String context);
}
