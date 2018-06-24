package com.leo.pattern.structural.proxy;

/**
 * 代理类 其工作方法内容为实际类的调用
 * 实际类可以不对外暴露
 *
 * @author leo, ZhangWei
 * @date 2018/6/24
 */
public class ProxyImage implements Image {

    private Image image;

    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage();
        }
        image.displayImage();
    }
}
