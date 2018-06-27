package com.leo.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public class Company implements HandleVisitor {

    private Boss boss;
    private List<Worker> workers;

    public Company() {
        boss = new Boss();
        workers = new ArrayList<>();
        workers.add(new Worker());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        boss.accept(visitor);
        for (Worker worker : workers) {
            worker.accept(visitor);
        }
    }
}
