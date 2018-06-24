package com.leo.pattern.structural.proxy;

import android.util.Log;

/**
 * 实际工作者
 *
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public class RealImage implements Image {

    @Override
    public void displayImage() {
        Log.i("RealImage", "I real do it , display it!");
    }
}
