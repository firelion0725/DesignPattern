package com.leo.pattern.creational.builder;

/**
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("milk");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("hawaiian");
    }
}
