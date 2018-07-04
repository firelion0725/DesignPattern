package com.leo.pattern.structural.adapter;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/7/4
 */
public class KeyBroad {

    private MyAdapter adapter;

    private USB usb;

    public KeyBroad(MyAdapter adapter) {
        this.adapter = adapter;
        usb = adapter.change();
    }

    public void action() {
        Log.i("KeyBroad", "KeyBroad input usb data:" + usb.getUsbData());
    }

}
