package com.leo.pattern.creational.single;

/**
 * 枚举单例
 * <p>
 * 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式
 * 它不仅能避免多线程同步问题，而且还自动支持序列化机制
 *
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public enum EnumSingleton {

    /**
     * 单例
     */
    INSTANCE;

    public void show() {
        System.out.println("this is a EnumSingleton");
    }
}
