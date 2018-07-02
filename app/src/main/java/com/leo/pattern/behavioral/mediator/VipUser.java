package com.leo.pattern.behavioral.mediator;

/**
 * @author leo, ZhangWei
 * @date 2018/7/2
 */
public class VipUser implements User {
    @Override
    public String talk() {
        return "I'm vip user";
    }

    @Override
    public String name() {
        return "Leo";
    }
}
