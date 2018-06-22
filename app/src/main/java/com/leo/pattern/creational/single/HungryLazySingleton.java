package com.leo.pattern.creational.single;

/**
 * 这种方式比较常用，但容易产生垃圾对象
 * 没有加锁，执行效率会提高
 *
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public class HungryLazySingleton {

    private static HungryLazySingleton instance = new HungryLazySingleton();

    public static HungryLazySingleton getInstance() {
        return instance;
    }

    public void show() {
        System.out.println("this is a HungryLazySingleton");
    }
}
