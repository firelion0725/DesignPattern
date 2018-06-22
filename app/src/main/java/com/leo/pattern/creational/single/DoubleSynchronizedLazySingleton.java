package com.leo.pattern.creational.single;

/**
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * 在高频线程下会比较常见
 *
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public class DoubleSynchronizedLazySingleton {

    private volatile static DoubleSynchronizedLazySingleton singleton;

    public synchronized static DoubleSynchronizedLazySingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleSynchronizedLazySingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleSynchronizedLazySingleton();
                }
            }
        }
        return singleton;
    }

    public void show() {
        System.out.println("this is a DoubleSynchronizedLazySingleton");
    }
}
