package com.leo.pattern.behavioral.template;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public class Monopoly extends AbstractGame {

    @Override
    void initGame() {
        Log.i("Game", "Monopoly init");
    }

    @Override
    void loadData() {
        Log.i("Game", "Monopoly loadData");
    }

    @Override
    void play() {
        Log.i("Game", "Monopoly play");
    }

    @Override
    void saveData() {
        Log.i("Game", "Monopoly saveData");
    }

    @Override
    void destroyGame() {
        Log.i("Game", "Monopoly destroyGame");
    }
}
