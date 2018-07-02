package com.leo.pattern.structural.composite;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/7/2
 */
public class ChildComposite implements Composite {

    @Override
    public void action() {
        Log.i("ChildComposite", "ChildComposite action");
    }

}
