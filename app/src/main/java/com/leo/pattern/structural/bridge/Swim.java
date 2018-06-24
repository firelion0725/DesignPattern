package com.leo.pattern.structural.bridge;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public class Swim implements Action {
    @Override
    public void act() {
        Log.i("Swim", "I can swim");
    }
}
