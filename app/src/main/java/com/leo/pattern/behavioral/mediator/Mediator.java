package com.leo.pattern.behavioral.mediator;

import android.util.Log;

/**
 * 中介者又称为调停者模式
 * 定义好同事类对象到中介者对象的接口，用于各个同事类之间的通信。
 * <p>
 * 同事类：如果一个对象会影响其他的对象，同时也会被其他对象影响，那么这两个对象称为同事类。
 *
 * @author leo, ZhangWei
 * @date 2018/7/2
 */
public class Mediator {

    public void handle(User user1, User user2) {
        Log.i("Mediator", user1.name() + " talk to " + user2.name() + ":" + user1.talk());
        Log.i("Mediator", user2.name() + " back to " + user1.name() + ":" + user2.talk());
    }

}
