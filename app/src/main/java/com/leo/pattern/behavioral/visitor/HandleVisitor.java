package com.leo.pattern.behavioral.visitor;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public interface HandleVisitor {

    void accept(Visitor visitor);

}
