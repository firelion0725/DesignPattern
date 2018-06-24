package com.leo.pattern.creational.prototype;

/**
 * 原型模式（Prototype Pattern）是用于创建重复的对象
 * 通过克隆接口复制一个一摸一样的对象 适用于构造复杂对象（注意深拷贝）
 * 有时也会用数据结构进行缓存
 *
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public class PrototypeDemo implements Cloneable {

    private int id;
    private String name;

    public PrototypeDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PrototypeDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
