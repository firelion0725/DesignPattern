package com.leo.pattern.creational.single;

/**
 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低.
 *
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton instance;

    public static synchronized SynchronizedLazySingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazySingleton();
        }
        return instance;
    }

    public void show() {
        System.out.println("this is a SynchronizedLazySingleton");
    }
}
