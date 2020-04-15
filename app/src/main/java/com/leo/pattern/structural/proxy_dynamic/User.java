package com.leo.pattern.structural.proxy_dynamic;

/**
 * @author Leo.ZhangTJ
 * @time 2020/4/15
 * @function
 * @describe
 */
public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
