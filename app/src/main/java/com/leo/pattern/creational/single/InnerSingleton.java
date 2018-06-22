package com.leo.pattern.creational.single;

/**
 * 登记式/静态内部类
 * <p>
 * 这种方式同样利用了 classloder 机制来保证初始化 instance 时只有一个线程
 * 它跟第 3 种方式不同的是：第 3 种方式只要 Singleton 类被装载了
 * 那么 instance 就会被实例化（没有达到 lazy loading 效果）
 * 而这种方式是 Singleton 类被装载了，instance 不一定被初始化。
 * 因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时
 * 才会显式装载 SingletonHolder 类，从而实例化 instance。
 *
 * 理论上Android更多使用该类单例
 *
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public class InnerSingleton {

    private static class SingletonHolder {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    public static InnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void show() {
        System.out.println("this is a InnerSingleton");
    }
}
