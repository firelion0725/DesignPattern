package com.leo.pattern.creational.abstract_factory;

/**
 * @author leo, ZhangWei
 * @date 2018/6/22
 */
public class ColorFactory extends AbstractShapeFactory {

    public static final String RED = "Red";
    public static final String GREEN = "Greend";

    @Override
    Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        Color color = null;
        switch (colorType) {
            case RED:
                color = new Red();
                break;
            case GREEN:
                color = new Green();
                break;
            default:
        }

        return color;
    }
}
