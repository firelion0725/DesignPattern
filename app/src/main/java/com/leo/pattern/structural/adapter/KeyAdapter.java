package com.leo.pattern.structural.adapter;

/**
 * @author leo, ZhangWei
 * @date 2018/7/4
 */
public class KeyAdapter implements MyAdapter {

    private P2P p;

    public KeyAdapter(P2P p) {
        this.p = p;
    }

    @Override
    public USB change() {
        return new USB(p.getData());
    }
}
