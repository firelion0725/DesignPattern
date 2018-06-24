package com.leo.pattern.structural.bridge;

/**
 * 桥接模式把事物对象和其具体行为、具体特征分离开来，使它们可以各自独立的变化
 * <p>
 * 行为抽象模板
 *
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public interface Action {

    void act();
}
