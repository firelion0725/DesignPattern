package com.leo.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leo, ZhangWei
 * @date 2018/7/2
 */
public class Root implements Composite {

    private List<Composite> list = new ArrayList<>();

    public void add(Composite composite) {
        list.add(composite);
    }

    @Override
    public void action() {
        for (Composite composite : list) {
            composite.action();
        }
    }
}
