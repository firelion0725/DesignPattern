package com.leo.pattern.behavioral.visitor;

import android.util.Log;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public class VisitorImpl implements Visitor {
    @Override
    public void visit(Boss boss) {
        Log.i("Visitor", "this is boss");
    }

    @Override
    public void visit(Worker worker) {
        Log.i("Visitor", "this is worker");
    }

    @Override
    public void visit(Company company) {
        Log.i("Visitor", "this is company");
    }
}
