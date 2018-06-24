package com.leo.pattern.structural.bridge;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public class Fly implements Action {
    @Override
    public void act() {
        Log.i("Fly","I can fly");
    }
}
