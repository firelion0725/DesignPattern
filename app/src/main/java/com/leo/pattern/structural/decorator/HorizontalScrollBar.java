package com.leo.pattern.structural.decorator;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/25
 */
public class HorizontalScrollBar extends WindowDecorator {

    public HorizontalScrollBar(Window decoratedWindow) {
        super(decoratedWindow);
    }

    @Override
    public void draw() {
        super.draw();
        Log.i("HorizontalScrollBar", "HorizontalScrollBar draw");
    }
}
