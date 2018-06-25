package com.leo.pattern.structural.facade;

/**
 * 最常见于 SDK的init方法 初始化内部各个模块
 *
 * @author leo, ZhangWei
 * @date 2018/6/25
 */
public class Computer {

    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    public void startComputer(){
        cpu.startCpu();
        memory.loadData();
        hardDrive.readSystem();
    }


}
