package com.leo.pattern.behavioral.visitor;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public class Boss implements HandleVisitor {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
