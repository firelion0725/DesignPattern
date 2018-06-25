package com.leo.pattern.structural.facade;

import android.util.Log;

/**
 * 外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
 *
 * @author leo, ZhangWei
 * @date 2018/6/25
 */
public class CPU {

    void startCpu() {
        Log.i("CPU", "start cpu");
    }

}
