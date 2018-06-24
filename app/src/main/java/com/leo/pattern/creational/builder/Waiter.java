package com.leo.pattern.creational.builder;

/**
 * 导向器
 *
 * @author leo, ZhangWei
 * @date 2018/6/24
 * @see <a href="参考">https://zh.wikipedia.org/wiki/%E7%94%9F%E6%88%90%E5%99%A8%E6%A8%A1%E5%BC%8F</a>
 */
public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public Waiter(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
        return pizzaBuilder.pizza;
    }
}
