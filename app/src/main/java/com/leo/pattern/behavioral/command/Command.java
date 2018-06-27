package com.leo.pattern.behavioral.command;

/**
 * 命令模式尝试以对象来代表实际行动，把行动(action) 及其参数封装起来，于是这些行动可以被
 * 重复多次
 * 取消（如果该对象有实现的话）
 * 取消后又再重做
 *
 * @author leo, ZhangWei
 * @date 2018/6/27
 */
public interface Command {
    void execute();
}
