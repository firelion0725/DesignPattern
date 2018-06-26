package com.leo.pattern.structural.flyweight;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/26
 */
public class BMW implements Car {
    @Override
    public void start() {
        Log.i("Car","BMW start");
    }
}
