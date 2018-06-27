package com.leo.pattern.behavioral.visitor;

/**
 * 访问者模式是一种将算法与对象结构分离的软件设计模式
 * 首先我们拥有一个由许多对象构成的对象结构，这些对象的类都拥有一个accept方法用来接受访问者对象
 * 这个方法对访问到的对象结构中不同类型的元素作出不同的反应
 * 从而使访问者得以处理对象结构的每一个元素
 *
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public interface Visitor {

    void visit(Boss boss);

    void visit(Worker worker);

    void visit(Company company);

}
