package com.leo.pattern.structural.adapter;

/**
 * 适配器就是一种适配中间件，它存在于不匹配的二者之间，用于连接二者，将不匹配变得匹配
 * 本示例为适配器模式的一个改版 为接收方接受的为适配器
 *
 * @author leo, ZhangWei
 * @date 2018/7/4
 */
public interface MyAdapter {

    USB change();

}
