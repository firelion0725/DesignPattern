package com.leo.pattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leo, ZhangWei
 * @date 2018/6/29
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
