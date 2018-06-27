package com.leo.pattern.behavioral.strategy;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public class FirstStrategy implements Strategy {
    @Override
    public void execute() {
        Log.i("Strategy", "do FirstStrategy");
    }
}
