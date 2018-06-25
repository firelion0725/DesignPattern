package com.leo.pattern.structural.decorator;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/25
 */
public class VerticalScrollBar extends WindowDecorator {
    public VerticalScrollBar(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw() {
        super.draw();
        Log.i("VerticalScrollBar", "VerticalScrollBar draw");
    }
}
