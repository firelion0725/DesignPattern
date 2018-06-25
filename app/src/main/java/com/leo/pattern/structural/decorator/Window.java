package com.leo.pattern.structural.decorator;

/**
 * 通过使用修饰模式，可以在运行时扩充一个类的功能
 * 原理是：增加一个修饰类包裹原来的类，包裹的方式一般是通过在将原来的对象作为修饰类的构造函数的参数
 * 通过super方法实现以前的功能，再追加新功能，不断迭代自身，实现扩展
 *
 * @author leo, ZhangWei
 * @date 2018/6/25
 */
public interface Window {

    void draw();

}
