package com.leo.pattern.behavioral.iterator;

/**
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 *
 * @author leo, ZhangWei
 * @date 2018/7/4
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
