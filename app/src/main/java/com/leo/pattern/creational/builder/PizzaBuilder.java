package com.leo.pattern.creational.builder;

/**
 * 实体构造器的抽象模型
 *
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();

}
