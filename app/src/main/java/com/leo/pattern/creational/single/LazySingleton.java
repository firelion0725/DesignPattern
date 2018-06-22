package com.leo.pattern.creational.single;

/**
 * 懒汉式，线程不安全
 * <p>
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 *
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public class LazySingleton {

    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void show() {
        System.out.println("this is a LazySingleton");
    }
}
