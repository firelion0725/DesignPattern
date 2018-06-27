package com.leo.pattern.behavioral.strategy;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public class Scenes {
    Strategy strategy;

    public Scenes(Strategy strategy) {
        this.strategy = strategy;
    }

    public void work() {
        strategy.execute();
    }
}
