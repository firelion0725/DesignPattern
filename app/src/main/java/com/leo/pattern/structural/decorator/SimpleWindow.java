package com.leo.pattern.structural.decorator;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/25
 */
public class SimpleWindow implements Window {
    @Override
    public void draw() {
        Log.i("SimpleWindow", "SimpleWindow draw");
    }
}
