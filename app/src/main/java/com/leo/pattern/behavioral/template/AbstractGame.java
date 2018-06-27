package com.leo.pattern.behavioral.template;

/**
 * 模板方法模式定义了一个算法的步骤,允许子类别为一个或多个步骤提供其实践方式
 *
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public abstract class AbstractGame {

    abstract void initGame();

    abstract void loadData();

    abstract void play();

    abstract void saveData();

    abstract void destroyGame();

    public void start() {
        initGame();
        loadData();
        play();
    }

    public void stop() {
        saveData();
        destroyGame();
    }

}
